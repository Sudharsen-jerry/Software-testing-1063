import java.util.Scanner;

public class Year {
    public static int[] calculateYearsWeeksDays(int m) {
        int year, week, day;
        year = m / 365;
        m = m % 365;
        week = m / 7;
        m = m % 7;
        day = m;

        System.out.println("No. of years:" + year);
        System.out.println("No. of weeks:" + week);
        System.out.println("No. of days:" + day);

        return new int[]{year, week, day};
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of days:");
        int m = s.nextInt();
        calculateYearsWeeksDays(m);
    }
}
