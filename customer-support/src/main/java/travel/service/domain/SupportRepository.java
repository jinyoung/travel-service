package travel.service.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import travel.service.domain.*;

@RepositoryRestResource(collectionResourceRel = "supports", path = "supports")
public interface SupportRepository
    extends PagingAndSortingRepository<Support, String> {}
