package JOHONG;

import java.util.Scanner;

public class exp10 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a number");
            double n = s.nextDouble();
            double a = 0, b = 0;
            a = n * n;
            b = n * n * n;

            System.out.println("The square of number = " + a);
            System.out.println("The cube of number = " + b);

            // Check if the calculated values match expected values
            if (a == expectedSquareOutput() && b == expectedCubeOutput()) {
                System.out.println("Assertions passed!");
            } else {
                System.out.println("Assertions failed!");
            }
        } catch (Exception e) {
            System.out.println("Invalid");
        }
    }

    // Define expected output methods
    private static double expectedSquareOutput() {
        // Define the expected square output for your specific scenario
        return 25.0;  // Replace with the expected value
    }

    private static double expectedCubeOutput() {
        // Define the expected cube output for your specific scenario
        return 125.0;  // Replace with the expected value
    }
}


