package BOHONG;
import java.util.Scanner;

public class exp2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the user name:");
        String str1 = in.nextLine();

        System.out.println("Reenter the user name:");
        String str2 = in.nextLine();

        // Check if the entered strings are equal
        if (str1.equals(str2)) {
            System.out.println("User names match!");
        } else {
            System.out.println("User names do not match.");
        }
    }
}

