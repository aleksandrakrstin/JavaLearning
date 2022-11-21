package IfElse;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a whole number of your choice:");
        int a = scan.nextInt();
        scan.close();
        int quote = 0;

        if (a > quote){
            System.out.println("Broj je veci od " + quote);
        }

    }
}
