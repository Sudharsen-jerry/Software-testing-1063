import java.util.Scanner;

public class CubeSquare {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a number");
            double n = s.nextDouble();
            double square = n * n;
            double cube = n * n * n;

            System.out.println("The square of the number = " + square);
            System.out.println("The cube of the number = " + cube);
        } catch (Exception e) {
            System.out.println("Invalid");
        }
    }

    public static double getSquareFromInput() {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        return n * n;
    }

    public static double getCubeFromInput() {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        return n * n * n;
    }
}
