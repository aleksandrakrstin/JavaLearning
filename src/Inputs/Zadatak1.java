package Inputs;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");

        int a = scan.nextInt();

        System.out.println("Enter another number");

        int b = scan.nextInt();
        scan.close();

        int sum = a + b;

        double m = (sum / 2); // sum >> 1 sam dobila isti rezultat.

        System.out.println("Mean = " + m);
    }
}
