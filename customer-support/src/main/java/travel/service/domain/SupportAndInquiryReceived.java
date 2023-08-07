package travel.service.domain;

import java.util.*;
import lombok.*;
import travel.service.domain.*;
import travel.service.infra.AbstractEvent;

@Data
@ToString
public class SupportAndInquiryReceived extends AbstractEvent {

    public SupportAndInquiryReceived(Support aggregate) {
        super(aggregate);
    }

    public SupportAndInquiryReceived() {
        super();
    }
}
