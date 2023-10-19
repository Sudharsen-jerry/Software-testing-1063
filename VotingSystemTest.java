import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class VotingSystemTest {

    private VotingSystem votingSystem;

    @Before
    public void setUp() {
        // Initialize the VotingSystem before each test
        votingSystem = new VotingSystem();
    }

    @Test
    public void testVoterEligibility() {
        assertTrue(votingSystem.isVoterEligible(18)); // Eligible voter
        assertFalse(votingSystem.isVoterEligible(17)); // Underage voter
    }

    @Test
    public void testVoteCount() {
        // Initially, there should be no votes
        assertEquals(0, votingSystem.getVoteCount());

        // Vote once
        votingSystem.vote("Candidate A");
        assertEquals(1, votingSystem.getVoteCount());

        // Try to vote again (should fail)
        votingSystem.vote("Candidate B");
        assertEquals(1, votingSystem.getVoteCount());
    }
}
