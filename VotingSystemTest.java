import org.junit.Test;
import static org.junit.Assert.*;

public class VotingSystemTest {

    @Test
    public void testIsEligibleToVote() {
        // Arrange
        VotingSystem votingSystem = new VotingSystem();

        // Act
        boolean eligible = votingSystem.isEligibleToVote(20);

        // Assert
        assertTrue(eligible);
    }

    @Test
    public void testIsNotEligibleToVote() {
        // Arrange
        VotingSystem votingSystem = new VotingSystem();

        // Act
        boolean eligible = votingSystem.isEligibleToVote(15);

        // Assert
        assertFalse(eligible);
    }
}
