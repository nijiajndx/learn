package gradle.sample;

import java.util.ResourceBundle;

/**
 * Created by sfit0450 on 2014/10/9.
 */
public class Sample {
    public Sample() {
    }

    public String getWelcomeMessage(){
        final ResourceBundle resourceBundle = ResourceBundle.getBundle("gradle.sample.messages");
        final String message = resourceBundle.getString("welcome");
        return message;
    }
}
