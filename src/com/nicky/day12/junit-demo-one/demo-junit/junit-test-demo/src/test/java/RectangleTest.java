import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    @Test
    public void testForGetArea(){
        Rectangle rectangle = new Rectangle();
        double result = rectangle.getArea(5, 3);
        assertEquals(result, 15);
        assertEquals(result, 100);
    }
}
