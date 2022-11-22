package IfElse;

import java.util.Scanner;

public class Zadatak9 {
    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        scan.close();

        int quote1 = 2;
        int quote2 = 3;

        if (x % quote1 == 0) {
            System.out.println("Number can be divided by 2.");
        }
        else if (x % quote2 == 0) {
            System.out.println("Number can be divided by 3.");
        }
        else if (x % quote1 == 0 && x % quote2 == 0) {
            System.out.println("Number can be divided by 2 and by 3 as well.");
        }
        else if (x % quote1 != 0 && x % quote2 != 0) {
            System.out.println("Number cannot be divided neither by 2 nor 3.");
        }
    }
}
