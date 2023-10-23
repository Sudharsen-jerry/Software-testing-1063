
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exp8Test {

    @Test
    public void testFactorialPositive() {
        // Test Case 1: Factorial of 5 (5!)
        int n1 = 5;
        int factorial1 = calculateFactorial(n1);
        assertEquals(120, factorial1);
    }

    @Test
    public void testFactorialZero() {
        // Test Case 2: Factorial of 0 (0!)
        int n2 = 0;
        int factorial2 = calculateFactorial(n2);
        assertEquals(1, factorial2);
    }

    // Function to calculate the factorial
    public static int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input should be a non-negative integer");
        }

        int pr = 1;
        for (int i = n; i > 0; i--) {
            pr = pr * i;
        }

        return pr;
    }
}
