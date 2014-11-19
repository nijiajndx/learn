package gradle.sample;

public class SampleApp {
    public SampleApp() {
    }

    public static void main(String[] args) {
        final SampleApp app = new SampleApp();
        app.welcomeMessage();
    }

    public void welcomeMessage(){
        final String welcomeMessage = readMessage();
        showMessage(welcomeMessage);
    }

    public String readMessage(){
        final ReadWelcomeMessage reader = new ReadWelcomeMessageImpl();
        final String message = reader.getWelcomeMessage();
        return message;
    }

    public void showMessage(final String message){
        System.out.println(message);
    }
}
