import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void addNumberTest(){
        // Arrange
         calculator = new Calculator();

        // Act
        int actualResult = calculator.addNumber(10,20);

        // Assert
        int expectedResult = 30;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void getMaxTest(){
        int aRes = calculator.getMax(new int[] {5,-2,5,7,8,-9,2,-1,23,567,21,0});
        int cRes = 567;
        assertEquals(cRes, aRes);
    }

    @Test
    public void getCubeTest(){
        double actualRes = calculator.getCube(3);
        assertEquals(27, actualRes);
    }

    @Test
    public void testForMultiplyTwoNumber(){
       int actualR = calculator.multiplyTwoNum(12, 7);
       int expectedR = 12*7;
        assertEquals(expectedR, actualR);
    }
}
