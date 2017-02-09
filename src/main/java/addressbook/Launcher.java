package addressbook; /**
 * Created by ryanbillard on 1/26/2017.
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Launcher {
    public void launch() {
        String[] contextPaths = new String[]{"app-context.xml"};
        new ClassPathXmlApplicationContext(contextPaths);
    }
}
