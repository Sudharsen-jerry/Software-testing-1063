
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exp9Test {

    @Test
    public void testLeapYear() {
        // Test Case 1: Leap Year (2000)
        String input1 = "01/01/2000";
        boolean isLeapYear1 = checkLeapYear(input1);
        assertEquals(true, isLeapYear1);
    }

    @Test
    public void testNonLeapYear() {
        // Test Case 2: Non-Leap Year (2022)
        String input2 = "01/01/2022";
        boolean isLeapYear2 = checkLeapYear(input2);
        assertEquals(false, isLeapYear2);
    }

    // Function to check if a year is a leap year
    public static boolean checkLeapYear(String input) {
        String[] dateParts = input.split("/", 3);
        int year = Integer.parseInt(dateParts[2]);

        if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
