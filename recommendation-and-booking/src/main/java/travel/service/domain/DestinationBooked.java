package travel.service.domain;

import java.util.*;
import lombok.*;
import travel.service.domain.*;
import travel.service.infra.AbstractEvent;

@Data
@ToString
public class DestinationBooked extends AbstractEvent {

    public DestinationBooked(Travel aggregate) {
        super(aggregate);
    }

    public DestinationBooked() {
        super();
    }
}
