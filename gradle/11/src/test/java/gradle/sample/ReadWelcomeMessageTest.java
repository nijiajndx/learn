package gradle.sample;

import junit.framework.Assert;
import org.junit.Test;

public class ReadWelcomeMessageTest {
    @Test
    public void readWelcomeMessage(){
        final ReadWelcomeMessage reader = new ReadWelcomeMessageImpl();
        final String realMessage = reader.getWelcomeMessage();
        final String expectMessage = "Welcome to Gradle.";

        Assert.assertEquals("Get text from implementation",expectMessage,realMessage);
    }
}
