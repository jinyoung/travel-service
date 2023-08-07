package travel.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import travel.service.RecommendationAndBookingApplication;
import travel.service.domain.DestinationBooked;
import travel.service.domain.DestinationRecommended;
import travel.service.domain.DestinationSearched;

@Entity
@Table(name = "Travel_table")
@Data
public class Travel {

    @Id
    private String destination;

    private Integer preference;

    private Money budget;

    private Integer duration;

    @PostPersist
    public void onPostPersist() {
        DestinationRecommended destinationRecommended = new DestinationRecommended(
            this
        );
        destinationRecommended.publishAfterCommit();

        DestinationSearched destinationSearched = new DestinationSearched(this);
        destinationSearched.publishAfterCommit();

        DestinationBooked destinationBooked = new DestinationBooked(this);
        destinationBooked.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static TravelRepository repository() {
        TravelRepository travelRepository = RecommendationAndBookingApplication.applicationContext.getBean(
            TravelRepository.class
        );
        return travelRepository;
    }
}
