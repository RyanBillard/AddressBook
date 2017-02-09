package addressbook; /**
 * Created by ryanbillard on 1/26/2017.
 */

import java.awt.event.ActionListener;
import javax.swing.JButton;

public class MyButton extends JButton {
    private ActionListener actionListener;

    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    public void init() {
        this.addActionListener(actionListener);
    }
}

