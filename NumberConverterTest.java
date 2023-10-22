import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberConverterTest {

    @Test
    public void testDecimalToBinary() {
        // Arrange
        int decimal = 15;

        // Act
        String binaryResult = NumberConverter.decimalToBinary(decimal);

        // Assert
        assertEquals("1111", binaryResult); // 15 in binary is 1111
    }

    @Test
    public void testDecimalToOctal() {
        // Arrange
        int decimal = 15;

        // Act
        String octalResult = NumberConverter.decimalToOctal(decimal);

        // Assert
        assertEquals("17", octalResult); // 15 in octal is 17
    }

    // Add more tests for different decimal values and edge cases
}
