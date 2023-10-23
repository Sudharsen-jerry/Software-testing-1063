package DOHONG;

import java.util.Scanner;

public class exp4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principal amount (P):");
        float P = sc.nextFloat();

        System.out.println("Enter time period (T):");
        float T = sc.nextFloat();

        System.out.println("Are you a senior citizen? (yes/no):");
        String isSenior = sc.next();

        float rateOfInterest = getRateOfInterest(isSenior);
        float SI = calculateSimpleInterest(P, T, rateOfInterest);

        System.out.println("Simple interest = " + SI);
    }

    // Function to calculate simple interest
    public static float calculateSimpleInterest(float principal, float time, float rateOfInterest) {
        return (principal * time * rateOfInterest) / 100;
    }

    // Function to determine the rate of interest based on customer type
    public static float getRateOfInterest(String customerType) {
        // Senior citizen gets 12%, others get 10%
        return customerType.equalsIgnoreCase("yes") ? 12 : 10;
    }
}
