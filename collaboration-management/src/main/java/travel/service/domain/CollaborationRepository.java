package travel.service.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import travel.service.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "collaborations",
    path = "collaborations"
)
public interface CollaborationRepository
    extends PagingAndSortingRepository<Collaboration, String> {}
