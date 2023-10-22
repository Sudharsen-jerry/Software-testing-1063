import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class LeapYearTest {

    @Test
    public void testLeapYear() {
        // Redirect System.in for testing
        String input = "01/01/2000"; // Example input with a leap year
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertTrue(LeapYear.isLeapYearFromInput());
        
        // Reset System.in
        System.setIn(System.in);

        // Redirect System.in for testing
        input = "01/01/2023"; // Example input with a non-leap year
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertFalse(LeapYear.isLeapYearFromInput());

        // Reset System.in
        System.setIn(System.in);
    }
}
