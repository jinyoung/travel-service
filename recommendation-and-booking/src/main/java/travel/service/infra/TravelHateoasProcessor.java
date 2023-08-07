package travel.service.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import travel.service.domain.*;

@Component
public class TravelHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Travel>> {

    @Override
    public EntityModel<Travel> process(EntityModel<Travel> model) {
        return model;
    }
}
