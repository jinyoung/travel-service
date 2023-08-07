package travel.service.domain;

import java.util.*;
import lombok.*;
import travel.service.domain.*;
import travel.service.infra.AbstractEvent;

@Data
@ToString
public class DestinationSearched extends AbstractEvent {

    public DestinationSearched(Travel aggregate) {
        super(aggregate);
    }

    public DestinationSearched() {
        super();
    }
}
