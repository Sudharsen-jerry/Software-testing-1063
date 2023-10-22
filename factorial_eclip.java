package HOHONG;
import java.util.Scanner;

public class exp8 {
    public static void main(String[] args) {
        int i, pr = 1;

        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number to find the factorial");
            int n = s.nextInt();

            if (n < 0) {
                System.out.println("Invalid");
            } else if (n == 0) {
                System.out.println("1");
            } else {
                for (i = n; i > 0; i--) {
                    pr = pr * i;
                }
                System.out.println("The answer is:" + pr);

                // Check if the calculated factorial is equal to 120
                if (pr == 120) {
                    System.out.println("Assertion passed!");
                } else {
                    System.out.println("Assertion failed!");
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid");
        }
    }
}
