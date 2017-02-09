package addressbook;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by ryanbillard on 2017-01-12.
 */
@Entity
public class AddressBook {
    private long id;
    private Collection<BuddyInfo> buddies;
    public AddressBook() {
        this.buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo b) {
        if (!buddies.contains(b)) {
            buddies.add(b);
        }
    }

    @Id
    @GeneratedValue
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @OneToMany(cascade = CascadeType.PERSIST)
    public Collection<BuddyInfo> getBuddies() {
        return this.buddies;
    }

    public void setBuddies(Collection<BuddyInfo> buddies) {
        this.buddies = buddies;
    }

    @Override
    public String toString() {
        String s = "";
        for(BuddyInfo b: buddies) {
            s += b.toString();
        }
        return s;
    }

//    public static void main(String[] args) {
//        Launcher launcher = new Launcher();
//        launcher.launch();
//    }
}
