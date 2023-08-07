package travel.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import travel.service.CollaborationManagementApplication;
import travel.service.domain.CollaborationManaged;

@Entity
@Table(name = "Collaboration_table")
@Data
public class Collaboration {

    @Id
    private String name;

    @PostPersist
    public void onPostPersist() {
        CollaborationManaged collaborationManaged = new CollaborationManaged(
            this
        );
        collaborationManaged.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static CollaborationRepository repository() {
        CollaborationRepository collaborationRepository = CollaborationManagementApplication.applicationContext.getBean(
            CollaborationRepository.class
        );
        return collaborationRepository;
    }
}
