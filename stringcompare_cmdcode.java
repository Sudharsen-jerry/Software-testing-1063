import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Stringtest {

    @Test
    public void testUserNamesMatch() {
        // Simulate user input
        String userInput1 = "JohnDoe";
        String userInput2 = "JohnDoe";

        // Your original logic
        if (userInput1.equals(userInput2)) {
            System.out.println("User names match!");
        } else {
            System.out.println("User names do not match.");
        }

        // JUnit assertion to check if user names match
        assertEquals(userInput1, userInput2);
    }
}
