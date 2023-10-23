
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exp3Test {

    @Test
    public void testVotingEligibility() {
        // Test Case 1: Age is 20 (eligible to vote)
        int age1 = 20;
        int yearsToVote1 = 18 - age1;

        if (age1 >= 18) {
            System.out.println("Welcome to the voting system. You can vote!");
        } else {
            System.out.println("Sorry, you can vote after: " + yearsToVote1 + " years");
        }

        // JUnit assertion to check if age is greater than or equal to 18
        assertTrue(age1 >= 18);
    }

    @Test
    public void testIneligibleToVote() {
        // Test Case 2: Age is 16 (ineligible to vote)
        int age2 = 16;
        int yearsToVote2 = 18 - age2;

        if (age2 >= 18) {
            System.out.println("Welcome to the voting system. You can vote!");
        } else {
            System.out.println("Sorry, you can vote after: " + yearsToVote2 + " years");
        }

        // JUnit assertion to check if age is less than 18
        assertFalse(age2 >= 18);
    }
}
