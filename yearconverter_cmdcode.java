
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exp7Test {

    @Test
    public void testNumberOfYears() {
        // Test Case 1: Number of days = 730 (2 years)
        int days1 = 730;
        int years1 = calculateYears(days1);
        assertEquals(2, years1);
    }

    @Test
    public void testNumberOfWeeks() {
        // Test Case 2: Number of days = 14 (2 weeks)
        int days2 = 14;
        int weeks2 = calculateWeeks(days2);
        assertEquals(2, weeks2);
    }

    // Function to calculate the number of years
    public static int calculateYears(int days) {
        return days / 365;
    }

    // Function to calculate the number of weeks
    public static int calculateWeeks(int days) {
        return days / 7;
    }
}
