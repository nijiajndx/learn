package gradle.sample;

/**
 * simple implementation to return welcome message.
 */
public class ReadWelcomeMessageImpl implements ReadWelcomeMessage {
    public ReadWelcomeMessageImpl() {
    }

    /**
     * Return "Welcome to Gardle." String value.
     * @return Welcome to Gradle.
     */
    @Override
    public String getWelcomeMessage() {
        return "Welcome to Gradle.";
    }
}
