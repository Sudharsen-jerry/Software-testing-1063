public class VotingSystem {

    public boolean isEligibleToVote(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        // Example of using VotingSystem
        VotingSystem votingSystem = new VotingSystem();
        System.out.println("Is eligible to vote: " + votingSystem.isEligibleToVote(20));
    }
}
