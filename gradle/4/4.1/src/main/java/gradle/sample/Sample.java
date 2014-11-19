package gradle.sample;

import java.util.ResourceBundle;

public class Sample implements ReadWelcomeMessage{
	public Sample(){}
	
	public String getWelcomeMessage(){
		final ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
		final String message = resourceBundle.getString("welcome");
		return message;
	}
}
