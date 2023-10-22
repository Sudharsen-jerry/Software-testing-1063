package GOHONG;
import java.util.Scanner;

public class exp7 {
    public static void main(String args[]) {
        int m, year, week, day;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of days:");
        m = s.nextInt();

        year = m / 365;
        
        // Check if the calculated number of years is equal to 2
        if (year == 2) {
            System.out.println("Assertion passed!");
        } else {
            System.out.println("Assertion failed!");
        }

        m = m % 365;
        System.out.println("No. of years:" + year);

        week = m / 7;
        m = m % 7;
        System.out.println("No. of weeks:" + week);

        day = m;
        System.out.println("No. of days:" + day);
    }
}

