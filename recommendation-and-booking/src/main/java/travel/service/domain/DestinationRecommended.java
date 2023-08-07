package travel.service.domain;

import java.util.*;
import lombok.*;
import travel.service.domain.*;
import travel.service.infra.AbstractEvent;

@Data
@ToString
public class DestinationRecommended extends AbstractEvent {

    public DestinationRecommended(Travel aggregate) {
        super(aggregate);
    }

    public DestinationRecommended() {
        super();
    }
}
