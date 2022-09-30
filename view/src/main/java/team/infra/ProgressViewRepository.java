package team.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import team.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "progressViews",
    path = "progressViews"
)
public interface ProgressViewRepository
    extends PagingAndSortingRepository<ProgressView, Long> {
    List<ProgressView> findByRequestId(Long requestId);
}
