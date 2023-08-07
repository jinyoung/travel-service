package travel.service.domain;

import java.util.*;
import lombok.*;
import travel.service.domain.*;
import travel.service.infra.AbstractEvent;

@Data
@ToString
public class PartnershipManaged extends AbstractEvent {

    public PartnershipManaged(Partnership aggregate) {
        super(aggregate);
    }

    public PartnershipManaged() {
        super();
    }
}
