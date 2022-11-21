package IfElse;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        System.out.println("Enter a number: ");

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        System.out.println("Enter another number:");
        int y = scan.nextInt();
        scan.close();

        String result1 = (x % 2 == 0) ? "Number " + x + " is even." : "Number " + x + " is odd.";
        System.out.println(result1);

        String result2 = (y % 2 == 0) ? "Number " + y + " is even." : "Number " + y + " is odd.";
        System.out.println(result2);
    }
}
