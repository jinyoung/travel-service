package travel.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import travel.service.CustomerSupportApplication;
import travel.service.domain.SupportAndInquiryReceived;

@Entity
@Table(name = "Support_table")
@Data
public class Support {

    @Id
    private String inquiry;

    @PostPersist
    public void onPostPersist() {
        SupportAndInquiryReceived supportAndInquiryReceived = new SupportAndInquiryReceived(
            this
        );
        supportAndInquiryReceived.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static SupportRepository repository() {
        SupportRepository supportRepository = CustomerSupportApplication.applicationContext.getBean(
            SupportRepository.class
        );
        return supportRepository;
    }
}
