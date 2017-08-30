import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.Assert.*;

public class GreetingTest {

    private Greeting greeting;

    @Before
    public void initialize(){
        greeting = new Greeting();
    }

    @Test
    public void greet() throws Exception {

        String result = greeting.greet("Jan");
        assertEquals("Hello, Jan", result);
    }

    @Test
    public void shouldGreetWithNull() throws Exception {

        String result = greeting.greet(null);
        assertEquals("Hello, my friend", result);
    }

    @Test
    public void shouldGreetWithSingleUppercaseName() throws Exception {

        String result = greeting.greet("JAN");
        assertEquals("HELLO JAN", result);
    }

    @Test
    public void shouldGreetManyNames() throws Exception {

        String result = greeting.greet("Jan", "Ala");
        assertEquals("Hello, Jan and Ala!", result);

    }

    @Test
    public void shouldGreetWithManyUppercase() throws Exception {
        String result = greeting.greet("Jan", "PIOTR", "Magda");
        assertEquals("Hello,Jan and Magda.AND HELLO PIOTR", result);
    }


}