package gradle.sample;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SampleTest {

    @Test
    public void testGetWelcomeMessage() throws Exception {
        final Sample sample = new Sample();
        final String realMessage = sample.getWelcomeMessage();
        final String expectedMessage = "Welcome to Gradle!";
        Assert.assertEquals("Get text from properties file",expectedMessage,realMessage);
    }
}