import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SimpleInterestCalculatorTest {

    @Test
    public void testCalculateSimpleInterestForSeniorCitizen() {
        // Arrange
        double principal = 1000.0;
        int years = 2;
        boolean isSeniorCitizen = true;

        // Act
        double result = SimpleInterestCalculator.calculateSimpleInterest(principal, years, isSeniorCitizen);

        // Assert
        assertEquals(240.0, result, 0.001); // 12% of 1000 for 2 years should be 240
    }

    @Test
    public void testCalculateSimpleInterestForRegularCustomer() {
        // Arrange
        double principal = 1000.0;
        int years = 2;
        boolean isSeniorCitizen = false;

        // Act
        double result = SimpleInterestCalculator.calculateSimpleInterest(principal, years, isSeniorCitizen);

        // Assert
        assertEquals(200.0, result, 0.001); // 10% of 1000 for 2 years should be 200
    }

    // Add more tests for different scenarios (negative values, zero values, etc.)
}
