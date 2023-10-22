package IOHONG;
import java.util.Scanner;


public class exp9{
    public static void main(String[] args) {
        System.out.println("Enter the date/month/year");
        Scanner s = new Scanner(System.in);
        String re = s.next();
        String[] r = re.split("/", 3);
        int x = Integer.parseInt(r[2]);

        // Check if the input year is equal to 2000
        if (x == 2000) {
            System.out.println("Assertion passed!");
        } else {
            System.out.println("Assertion failed!");
        }

        if (x % 4 == 0) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }
    }
}

