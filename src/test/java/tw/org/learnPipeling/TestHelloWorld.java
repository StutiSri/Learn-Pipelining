package tw.org.learnPipeling;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHelloWorld {
    @Test
    public void shouldReturnHelloWorld(){
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello World!", helloWorld.home());
    }
}
