package tw.org.learnPipeling;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HelloWorldTest {
    @Test
    public void shouldReturnHelloWorld(){
        assertEquals("Hello!", new HelloWorld().home());
    }
}
