package COHONG;
import java.util.Scanner;

public class exp3 {
    public static void main(String[] args) {
        int age, yearsToVote;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your age:");
        age = scan.nextInt();

        if (age >= 18) {
            System.out.println("Welcome to the voting system. You can vote!");
        } else {
            yearsToVote = 18 - age;
            System.out.println("Sorry, you can vote after: " + yearsToVote + " years");
            // No need for assertTrue in regular Java code
        }
    }
}

