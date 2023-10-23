

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class Exp5Test {

    @Test
    public void testPalindromeNumber() {
        // Test Case 1: Palindrome Number 121
        int n1 = 121;
        boolean isPalindrome1 = isPalindrome(n1);
        assertTrue(isPalindrome1);
    }

    @Test
    public void testNonPalindromeNumber() {
        // Test Case 2: Non-Palindrome Number 123
        int n2 = 123;
        boolean isPalindrome2 = isPalindrome(n2);
        assertFalse(isPalindrome2);
    }

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int n) {
        int r, sum = 0, temp = n;

        while (n > 0) {
            r = n % 10;
            n = n / 10;
            sum = (sum * 10) + r;
        }

        return temp == sum;
    }
}
