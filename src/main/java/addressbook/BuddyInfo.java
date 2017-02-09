package addressbook;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by ryanbillard on 2017-01-12.
 */
@Entity
public class BuddyInfo {

    private long id;
    private String name;
    private String number;

    public BuddyInfo() {

    }

    public BuddyInfo(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Id
    @GeneratedValue
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String toString() {
        return this.name + this.number;
    }
}
