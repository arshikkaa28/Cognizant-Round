import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AAAPatternTest {

    private int number;

    @Before
    public void setUp() {
        // Setup
        number = 10;
        System.out.println("Setup completed");
    }

    @Test
    public void testAddition() {

        // Arrange
        int value = number;

        // Act
        int result = value + 5;

        // Assert
        assertEquals(15, result);
    }

    @After
    public void tearDown() {
        // Cleanup
        System.out.println("Teardown completed");
    }
}