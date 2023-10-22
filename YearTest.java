import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class YearTest {

    @Test
    public void testCalculateYearsWeeksDays() {
        int m = 400; // Example number of days
        int[] expectedResult = {1, 1, 3}; // Expected result: 1 year, 1 week, 3 days

        int[] result = Year.calculateYearsWeeksDays(m);

        assertEquals(expectedResult[0], result[0]);
        assertEquals(expectedResult[1], result[1]);
        assertEquals(expectedResult[2], result[2]);
    }
}
