package gradle.sample;

/**
 * Created by sfit0450 on 2014/9/25.
 */
public class SampleApp {
    public SampleApp() {
    }

    public static void main(String[] args){
        final SampleApp app = new SampleApp();
        app.welcomeMessage();
    }

    public void welcomeMessage(){
        final  String welcomeMessage = readMessage();
        showMessage(welcomeMessage);
    }

    private String readMessage(){
        final Sample sample = new Sample();
        final String message = sample.getWelcomeMessage();
        return message;
    }

    private void showMessage(final String message){
        System.out.println(message);
    }
}
