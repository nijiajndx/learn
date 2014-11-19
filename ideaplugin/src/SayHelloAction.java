import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.ApplicationManager;

/**
 * Created by sfit0450 on 2014/10/16.
 */
public class SayHelloAction extends AnAction {
    @Override

    public void actionPerformed(AnActionEvent e) {

        Application application = ApplicationManager.getApplication();

        Mycoponent myComponent = application.getComponent(Mycoponent.class);

        myComponent.sayHello();

    }
}
