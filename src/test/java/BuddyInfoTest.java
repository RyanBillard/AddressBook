import addressbook.BuddyInfo;
import junit.framework.TestCase;

import javax.persistence.*;
import java.util.List;

/**
 * Created by ryanbillard on 2017-01-12.
 */
public class BuddyInfoTest extends TestCase {
    public void testToString() throws Exception {
        BuddyInfo b = new BuddyInfo("Ryan", "6131234567");
        assertEquals("Ryan6131234567", b.toString());
    }

//    public void testPersistence() {
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
//        Query q = em.createQuery("SELECT p FROM BuddyInfo p");
//
//        @SuppressWarnings("unchecked")
//        List<BuddyInfo> results = q.getResultList();
//
//
//        assert(results.contains(b));
//        assert(results.contains(b2));
//
//        em.close();
//        emf.close();
//    }

}