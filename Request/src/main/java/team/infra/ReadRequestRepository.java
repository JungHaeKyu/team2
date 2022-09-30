package team.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import team.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "readRequests",
    path = "readRequests"
)
public interface ReadRequestRepository
    extends PagingAndSortingRepository<ReadRequest, Long> {}
