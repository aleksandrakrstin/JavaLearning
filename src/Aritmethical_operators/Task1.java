package Aritmethical_operators;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Enter a number:");

        Scanner scan = new Scanner(System.in);
        double x = scan.nextInt();

        System.out.println("Enter another number:");
        double y = scan.nextInt();

        System.out.println("Enter an operation: (addition / subtraction / multiplication / division / modulus)");

        String operation = scan.next();
        scan.close();

        double add = (x + y);
        double sub = (x - y);
        double multip = (x * y);
        double div = (x / y);
        double mod = (x % y);

        switch (operation) {
            case "addition":
                System.out.println(add);
                break;
            case "subtraction":
                System.out.println(sub);
                break;
            case "multiplication":
                System.out.println(multip);
                break;
            case "division":
                System.out.println(div);
                break;
            case "modulus":
                System.out.println(mod);
                break;
        }

    }
}
