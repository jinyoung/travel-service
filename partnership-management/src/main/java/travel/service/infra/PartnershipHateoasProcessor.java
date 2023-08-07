package travel.service.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import travel.service.domain.*;

@Component
public class PartnershipHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Partnership>> {

    @Override
    public EntityModel<Partnership> process(EntityModel<Partnership> model) {
        return model;
    }
}
