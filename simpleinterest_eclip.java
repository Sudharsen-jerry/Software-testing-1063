package cohong;
import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter principal amount (P):");
        float P = sc.nextFloat();

        System.out.println("Enter rate of interest (R):");
        float R = sc.nextFloat();

        System.out.println("Enter time period (T):");
        float T = sc.nextFloat();

        float SI = (P * T * R) / 100;
        System.out.println("Simple interest = " + SI);

        // Manual check
        if (3600 == SI) {
            System.out.println("Assertion passed!");
        } else {
            System.out.println("Assertion failed!");
        }
    }
}
