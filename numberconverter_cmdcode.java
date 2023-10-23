
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Exp6Test {

    @Test
    public void testDecimalToBinary() {
        // Test Case 1: Decimal 10
        int decimal1 = 10;
        String binary1 = convertToBinary(decimal1);
        assertEquals("1010", binary1);
    }

    @Test
    public void testDecimalToOctal() {
        // Test Case 2: Decimal 20
        int decimal2 = 20;
        String octal2 = convertToOctal(decimal2);
        assertEquals("24", octal2);
    }

    // Function to convert decimal to binary
    public static String convertToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    // Function to convert decimal to octal
    public static String convertToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }
}
