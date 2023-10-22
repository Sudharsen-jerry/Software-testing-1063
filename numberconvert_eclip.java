package FOHONG;
import java.util.Scanner;

public class exp6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Decimal number
        int decimal = in.nextInt();

        // Convert decimal to binary
        String binary = Integer.toBinaryString(decimal);

        System.out.println("BINARY IS " + binary);

        // Convert decimal to octal
        System.out.print("OCTAL IS ");
        System.out.println(Integer.toOctalString(decimal));

        // Check if the decimal is equal to 14
        if (decimal == 14) {
            System.out.println("Assertion passed!");
        } else {
            System.out.println("Assertion failed!");
        }
    }
}



