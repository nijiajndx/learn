package gradle.sample;

/**
 * Created by sfit0450 on 2014/9/25.
 */
public class SampleApp {
    public SampleApp() {

    }

    public static void main(String[] args) {
        final SampleApp sampleApp = new SampleApp();
        sampleApp.welcomeMessage();
    }

    public void welcomeMessage(){
        final String welcomeMessage = readMessage();
        showMessage(welcomeMessage);
    }

    public String readMessage(){
        final Sample sample = new Sample();
        final String message = sample.getWelcomeMessage();
        return message;
    }

    public void showMessage(final String message){
        System.out.println(message);
    }

}
