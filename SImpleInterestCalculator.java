public class SimpleInterestCalculator {

    public static double calculateSimpleInterest(double principal, int years, boolean isSeniorCitizen) {
        double rateOfInterest = isSeniorCitizen ? 0.12 : 0.10;
        return principal * rateOfInterest * years;
    }

    public static void main(String[] args) {
        // Example of using the function
        double principalAmount = 1000.0;
        int numberOfYears = 2;
        boolean isSeniorCitizen = true; // Change this to false for a non-senior citizen

        double simpleInterest = calculateSimpleInterest(principalAmount, numberOfYears, isSeniorCitizen);

        System.out.println("Simple Interest: " + simpleInterest);
    }
}
