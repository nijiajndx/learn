package gradle.sample;

import org.testng.AssertJUnit;

public class SampleTestNG {

    @org.testng.annotations.Test
    public void testGetWelcomeMessage() throws Exception {
        final  Sample sample = new Sample();
        final String realMessage = sample.getWelcomeMessage();
        final String expectedMessage = "Welcome to Gradle!";
        AssertJUnit.assertEquals("Get text from properties file",realMessage,expectedMessage);
    }
}