import addressbook.AddressBook;
import addressbook.BuddyInfo;
import junit.framework.TestCase;

import javax.persistence.*;
import java.util.List;

/**
 * Created by ryanbillard on 2017-01-12.
 */
public class AddressBookTest extends TestCase {
    private AddressBook ab;
    private BuddyInfo buddy;
    public void setUp() throws Exception {
        super.setUp();
        ab = new AddressBook();
        buddy = new BuddyInfo("Ryan", "6132221111");
    }

    public void testAddBuddy() throws Exception {
        assertEquals("", ab.toString());
        ab.addBuddy(buddy);
        assertEquals("Ryan6132221111", ab.toString());
    }

//    public void testPersistAddressBook() {
//
//        BuddyInfo b = new BuddyInfo();
//        b.setName("Stephane");
//        b.setNumber("666");
//
//        BuddyInfo b2 = new BuddyInfo();
//        b2.setName("Sarran");
//        b2.setNumber("111");
//
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceUnit");
//
//        EntityManager em = emf.createEntityManager();
//
//        EntityTransaction tx = em.getTransaction();
//
//        tx.begin();
//
//        em.persist(b);
//        em.persist(b2);
//
//        tx.commit();
//
//        AddressBook a = new AddressBook();
//        a.addBuddy(b);
//        a.addBuddy(b2);
//
//        tx = em.getTransaction();
//        tx.begin();
//
//        em.persist(a);
//
//        tx.commit();
//
//        Query q = em.createQuery("SELECT p FROM AddressBook p");
//
//        @SuppressWarnings("unchecked")
//        List<AddressBook> results = q.getResultList();
//
//
//        assert(results.get(0).getBuddies().contains(b));
//        assert(results.get(0).getBuddies().contains(b2));
//
//        em.close();
//        emf.close();
//    }
//
//    public void testCascadingPersistAddressBook() {
//
//        BuddyInfo b = new BuddyInfo();
//        b.setName("Stephane");
//        b.setNumber("666");
//
//        BuddyInfo b2 = new BuddyInfo();
//        b2.setName("Sarran");
//        b2.setNumber("111");
//
//        AddressBook a = new AddressBook();
//        a.addBuddy(b);
//        a.addBuddy(b2);
//
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceUnit");
//
//        EntityManager em = emf.createEntityManager();
//
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//
//        em.persist(a);
//
//        tx.commit();
//
//        Query q = em.createQuery("SELECT p FROM AddressBook p");
//
//        @SuppressWarnings("unchecked")
//        List<AddressBook> results = q.getResultList();
//
//
//        assert(results.get(0).getBuddies().contains(b));
//        assert(results.get(0).getBuddies().contains(b2));
//
//        em.close();
//        emf.close();
//    }
}