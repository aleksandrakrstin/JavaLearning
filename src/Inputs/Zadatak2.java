package Inputs;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        System.out.println("Enter your student number");
        int studentNum = scan.nextInt();

        System.out.println("Enter your GPA");
        double gpa = scan.nextDouble();

        System.out.println("Ime: " + name);
        System.out.println("Prezime: " + lastName);
        System.out.println("Br. ind: " + studentNum);
        System.out.println("Prosek: " + gpa);
    }
}
