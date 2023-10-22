import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WordReverserTest {

    @Test
    public void testReverse() {
        WordReverser reverser = new WordReverser();

        // Test with a regular word
        String reversedWord = reverser.reverse("hello");
        assertEquals("olleh", reversedWord);

        // Test with an empty word
        reversedWord = reverser.reverse("");
        assertEquals("", reversedWord);

        // Test with a single-character word
        reversedWord = reverser.reverse("a");
        assertEquals("a", reversedWord);

        // Test with a null input (expecting an IllegalArgumentException)
        try {
            reversedWord = reverser.reverse(null);
        } catch (IllegalArgumentException e) {
            assertEquals("Input cannot be null", e.getMessage());
        }
    }
}
