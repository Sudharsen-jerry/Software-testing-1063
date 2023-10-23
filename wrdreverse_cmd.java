
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class word {

    @Test
    public void testReverseString() {
        // Test Case 1
        String userInput1 = "Hello";
        System.out.println("Reverse of a String '" + userInput1 + "' is :");
        StringBuilder reversedString1 = new StringBuilder();
        for (int j = userInput1.length() - 1; j >= 0; --j) {
            System.out.print(userInput1.charAt(j));
            reversedString1.append(userInput1.charAt(j));
        }
        assertEquals("olleH", reversedString1.toString());

        // Test Case 2
        String userInput2 = "Java";
        System.out.println("\nReverse of a String '" + userInput2 + "' is :");
        StringBuilder reversedString2 = new StringBuilder();
        for (int j = userInput2.length() - 1; j >= 0; --j) {
            System.out.print(userInput2.charAt(j));
            reversedString2.append(userInput2.charAt(j));
        }
        assertEquals("avaJ", reversedString2.toString());
    }
}
