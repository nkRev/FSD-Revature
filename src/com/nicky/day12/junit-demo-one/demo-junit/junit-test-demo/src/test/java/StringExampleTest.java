import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringExampleTest {
    StringExample stringExample;

    @BeforeEach
    public void setup(){
        stringExample = new StringExample();
    }

    @Test
    public void compareFirstAndLastCharTest(){

        boolean actualVal   = stringExample.confirmFirstAndLastCharAreSame("ABAB");

        //assertEquals(actualVal, true);
        assertTrue(actualVal);
    }

    @Test
    public void reverseStringTest(){
        assertEquals("dlrowolleh", stringExample.reverseString("helloworld"));

    }
}
