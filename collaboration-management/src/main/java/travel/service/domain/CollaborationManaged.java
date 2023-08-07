package travel.service.domain;

import java.util.*;
import lombok.*;
import travel.service.domain.*;
import travel.service.infra.AbstractEvent;

@Data
@ToString
public class CollaborationManaged extends AbstractEvent {

    public CollaborationManaged(Collaboration aggregate) {
        super(aggregate);
    }

    public CollaborationManaged() {
        super();
    }
}
