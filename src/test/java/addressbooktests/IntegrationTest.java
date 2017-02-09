package addressbooktests;

import addressbook.AddressBook;
import addressbook.Application;
import addressbook.BuddyInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URI;
import java.net.URL;

/**
 * Created by ryanbillard on 2/2/2017.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IntegrationTest {
    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate template;

    @Before
    public void setUp() throws Exception {
        this.base = new URL("http://localhost:" + port + "/");
    }

    @Test
    public void createBuddy() throws Exception {
        BuddyInfo b = new BuddyInfo("Ryan", "111");
        ResponseEntity<String> response = template.postForEntity(this.base.toString() + "/buddies", b, String.class);
        assert (response.getStatusCode().equals(HttpStatus.CREATED));
    }

    @Test
    public void deleteBuddy() throws Exception {
        BuddyInfo b = new BuddyInfo("Ryan", "111");
        ResponseEntity<String> response = template.postForEntity(this.base.toString() + "/buddies", b, String.class);
        assert (response.getStatusCode().equals(HttpStatus.CREATED));

        template.delete(new URI(this.base.toString() + "/buddies/1"));

        ResponseEntity<String> getResponse = template.getForEntity(new URI(this.base.toString() + "/buddies/1"), String.class);
        assert (getResponse.getStatusCode().equals(HttpStatus.NOT_FOUND));
    }

    @Test
    public void createAddressBook() throws Exception {
        AddressBook a = new AddressBook();
        ResponseEntity<String> response = template.postForEntity(this.base.toString() + "/books", a, String.class);
        assert (response.getStatusCode().equals(HttpStatus.CREATED));
    }

    @Test
    public void addBuddyToAddressBook() throws Exception {
        AddressBook a = new AddressBook();
        ResponseEntity<String> response = template.postForEntity(this.base.toString() + "/books", a, String.class);
        assert (response.getStatusCode().equals(HttpStatus.CREATED));

        BuddyInfo b = new BuddyInfo("Ryan", "12345");
        ResponseEntity<String > addResponse = template.postForEntity(this.base.toString() + "/books/1/buddies", b, String.class);
        assert (response.getStatusCode().equals(HttpStatus.CREATED));
    }
}
