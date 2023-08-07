package travel.service.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import travel.service.domain.*;

@Component
public class CollaborationHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Collaboration>> {

    @Override
    public EntityModel<Collaboration> process(
        EntityModel<Collaboration> model
    ) {
        return model;
    }
}
