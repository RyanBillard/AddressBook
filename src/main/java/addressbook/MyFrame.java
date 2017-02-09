package addressbook;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ryanbillard on 1/26/2017.
 */
public class MyFrame extends JFrame {
    public void init() {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new Dimension(600, 400));
        setState(Frame.NORMAL);
        setVisible(true);
    }
}
