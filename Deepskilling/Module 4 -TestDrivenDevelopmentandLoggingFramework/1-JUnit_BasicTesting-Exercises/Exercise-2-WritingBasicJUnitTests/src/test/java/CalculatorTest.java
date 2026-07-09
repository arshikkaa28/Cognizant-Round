import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(30, calculator.add(10, 20));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.subtract(10, 5));
    }
}