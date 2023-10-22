import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the date/month/year");
        if (isLeapYearFromInput()) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }
    }

    public static boolean isLeapYearFromInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String[] parts = input.split("/", 3);
        int year = Integer.parseInt(parts[2]);

        return isLeapYear(year);
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
