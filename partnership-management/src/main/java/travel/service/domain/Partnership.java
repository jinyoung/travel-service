package travel.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import travel.service.PartnershipManagementApplication;
import travel.service.domain.PartnershipManaged;

@Entity
@Table(name = "Partnership_table")
@Data
public class Partnership {

    @Id
    private String name;

    @PostPersist
    public void onPostPersist() {
        PartnershipManaged partnershipManaged = new PartnershipManaged(this);
        partnershipManaged.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static PartnershipRepository repository() {
        PartnershipRepository partnershipRepository = PartnershipManagementApplication.applicationContext.getBean(
            PartnershipRepository.class
        );
        return partnershipRepository;
    }
}
