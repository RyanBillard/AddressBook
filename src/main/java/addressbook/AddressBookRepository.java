package addressbook;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by ryanbillard on 1/26/2017.
 */
@RepositoryRestResource(collectionResourceRel = "books", path="books")
public interface AddressBookRepository extends CrudRepository<AddressBook, Long> {

}
