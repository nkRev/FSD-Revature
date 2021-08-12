import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CountTest {
    Counter counter;

    @BeforeEach
    public void setup(){
        System.out.println("before test");
        counter = new Counter();
    }

    @Test
    public void incrementTest(){
        System.out.println("increment test");

        int cVal = counter.increment();

        assertEquals(cVal, 1);

    }

    @Test
    public void decrementTest(){
        System.out.println("Decrement test");

        int cVal = counter.decrement();

        assertEquals(cVal, -1);
    }
    @AfterEach
    public void tearDown(){
        System.out.println("after test");
        counter = null;
    }
}
