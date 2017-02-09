package addressbook; /**
 * Created by ryanbillard on 1/26/2017.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.persistence.*;
import javax.swing.*;

public class MyActionListener implements ActionListener {
    private JTextField nameField;
    private JTextField numberField;
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceUnit");
    private EntityManager em = emf.createEntityManager();

    public void setNameField(JTextField nameField) {
        this.nameField = nameField;
    }

    public void setNumberField(JTextField numberField) {
        this.numberField = numberField;
    }

    public void actionPerformed(ActionEvent e) {
        BuddyInfo b = new BuddyInfo(nameField.getText(), numberField.getText());
        AddressBook a = loadAddressBook();
        a.addBuddy(b);
        saveAddressBook(a);
        JOptionPane.showMessageDialog(null, "Created entry for " + b.getName() + ".\nAddress book now has " + a.getBuddies().size() + "entries.");

    }

    public AddressBook loadAddressBook() {

        emf = Persistence.createEntityManagerFactory("PersistenceUnit");

        em = emf.createEntityManager();

        Query q = em.createQuery("SELECT p FROM AddressBook p");

        AddressBook a;
        if (q.getResultList().size() > 0) {
            a = (AddressBook) q.getResultList().get(0);
        } else {
            a = new AddressBook();
        }

        return a;
    }

    public void saveAddressBook(AddressBook a) {

        emf = Persistence.createEntityManagerFactory("PersistenceUnit");

        em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        tx.begin();

        em.persist(a);

        tx.commit();
    }
}

