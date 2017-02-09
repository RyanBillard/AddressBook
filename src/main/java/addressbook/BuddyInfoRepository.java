package addressbook; /**
 * Created by ryanbillard on 1/26/2017.
 */

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.ArrayList;

@RepositoryRestResource(collectionResourceRel = "buddies", path="buddies")
public interface BuddyInfoRepository extends CrudRepository<BuddyInfo, Long> {
}
