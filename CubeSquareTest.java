import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class CubeSquareTest {

    @Test
    public void testCubeSquare() {
        // Redirect System.in for testing
        String input = "6"; // Example input
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        CubeSquare.main(new String[]{});

        // Reset System.in
        System.setIn(System.in);

        double expectedSquare = 25.0;
        double expectedCube = 125.0;

        assertEquals(expectedSquare, CubeSquare.getSquareFromInput(), 0.001);
        assertEquals(expectedCube, CubeSquare.getCubeFromInput(), 0.001);
    }
}
