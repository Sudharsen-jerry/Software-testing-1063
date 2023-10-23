import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindrome() {
        // Test case 1: Palindrome number
        assertTrue(PalindromeChecker.isPalindrome(121));

        // Test case 2: Non-palindrome number
        assertFalse(PalindromeChecker.isPalindrome(123));

        // Test case 3: Single-digit number (always a palindrome)
        assertTrue(PalindromeChecker.isPalindrome(7));

        // Test case 4: Negative number (considered not palindrome)
        assertFalse(PalindromeChecker.isPalindrome(-121));

        // Test case 5: Zero (always a palindrome)
        assertTrue(PalindromeChecker.isPalindrome(0));
    }
}
