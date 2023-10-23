

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exp10Test {

    @Test
    public void testSquareAndCube() {
        // Test Case 1: Number 5
        double input = 5.0;
        double expectedSquare = 25.0;
        double expectedCube = 125.0;

        double actualSquare = calculateSquare(input);
        double actualCube = calculateCube(input);

        // JUnit assertions to check if calculated values match expected values
        assertEquals(expectedSquare, actualSquare, 0.01);
        assertEquals(expectedCube, actualCube, 0.01);
    }

    // Function to calculate the square
    public static double calculateSquare(double n) {
        return n * n;
    }

    // Function to calculate the cube
    public static double calculateCube(double n) {
        return n * n * n;
    }
}
