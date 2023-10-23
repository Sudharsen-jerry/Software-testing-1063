import org.junit.Test;
import static org.junit.Assert.*;

public class Exp4Test {

    @Test
    public void testCalculateSimpleInterest() {
        // Test Case 1: Principal = 2000, Time = 3 years, Rate = 10%
        float P1 = 2000;
        float T1 = 3;
        float rate1 = 10.0f;

        float SI1 = calculateSimpleInterest(P1, T1, rate1);

        // JUnit assertion to check if Simple Interest is calculated correctly
        assertEquals(600, SI1, 0.01); // 0.01 is the delta for floating-point comparisons
    }

    @Test
    public void testSeniorCitizenInterest() {
        // Test Case 2: Senior citizen, Principal = 1500, Time = 2 years
        float P2 = 1500;
        float T2 = 2;

        float rate2 = getRateOfInterest("yes");
        float SI2 = calculateSimpleInterest(P2, T2, rate2);

        // JUnit assertion to check if rate for senior citizen is 12%
        assertEquals(360, SI2, 0.01);
    }

    // Function to calculate simple interest
    public static float calculateSimpleInterest(float principal, float time, float rateOfInterest) {
        return (principal * time * rateOfInterest) / 100;
    }

    // Function to determine the rate of interest based on customer type
    public static float getRateOfInterest(String customerType) {
        // Senior citizen gets 12%, others get 10%
        return customerType.equalsIgnoreCase("yes") ? 12.0f : 10.0f;
    }
}
