package travel.service.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import travel.service.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "partnerships",
    path = "partnerships"
)
public interface PartnershipRepository
    extends PagingAndSortingRepository<Partnership, String> {}
