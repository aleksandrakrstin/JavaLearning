package Inputs;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

        int quote = 0;

        System.out.println("Enter a whole number:");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        System.out.println("Enter another whole number: ");
        int y = scan.nextInt();
        scan.close();

        if (x > quote && y > quote) {
            System.out.println("Entered numbers are higher than 0");
        }
        else if (x > quote && y < quote) {
            System.out.println("The first entered number is higher than 0, " +
                    "while the second number is lower than 0");
        }
        else if (x < quote && y > quote) {
            System.out.println("The first entered number is lower than 0, " +
                    "while the second number is higher than 0");
        }
        else if (x == quote) {
            System.out.println("The first entered number equals 0");
        }
        else if (y == quote) {
            System.out.println("The second entered number equals 0");
        }
        else {
            System.out.println("Entered numbers are lower than 0");
        }
    }
}
