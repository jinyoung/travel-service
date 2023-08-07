package travel.service.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import travel.service.domain.*;

@Component
public class SupportHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Support>> {

    @Override
    public EntityModel<Support> process(EntityModel<Support> model) {
        return model;
    }
}
