package travel.service.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import travel.service.domain.*;

@RepositoryRestResource(collectionResourceRel = "travels", path = "travels")
public interface TravelRepository
    extends PagingAndSortingRepository<Travel, String> {}
