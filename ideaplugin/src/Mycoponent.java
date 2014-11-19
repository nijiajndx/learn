import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

/**
 * Created by sfit0450 on 2014/10/16.
 */
public class Mycoponent implements ApplicationComponent {
    public Mycoponent() {
    }

    public void initComponent() {
        // TODO: insert component initialization logic here
    }

    public void disposeComponent() {
        // TODO: insert component disposal logic here
    }

    @NotNull
    public String getComponentName() {
        return "Mycoponent";
    }

    public void sayHello() {

        // Show dialog with message

        Messages.showMessageDialog(

                "Hello World!",

                "Sample",

                Messages.getInformationIcon()

        );

    }
}
