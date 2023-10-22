import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FactorialCalculatorTest {

    @Test
    public void testCalculateFactorial() {
        // Arrange
        int n = 5;

        // Act
        long result = FactorialCalculator.calculateFactorial(n);

        // Assert
        assertEquals(120, result);
    }

    @Test
    public void testCalculateFactorialForZero() {
        // Arrange
        int n = 0;

        // Act
        long result = FactorialCalculator.calculateFactorial(n);

        // Assert
        assertEquals(1, result);
    }

    @Test
    public void testCalculateFactorialForOne() {
        // Arrange
        int n = 1;

        // Act
        long result = FactorialCalculator.calculateFactorial(n);

        // Assert
        assertEquals(1, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateFactorialForNegativeNumber() {
        // Arrange
        int n = -2;

        // Act/Assert
        FactorialCalculator.calculateFactorial(n);
    }

    // Add more tests for different values of n, edge cases, and boundary values
}
