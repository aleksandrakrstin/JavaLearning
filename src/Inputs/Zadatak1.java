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

        double sum = a + b;

        double m = (sum / 2);

        System.out.println("Mean = " + m);
    }
}
