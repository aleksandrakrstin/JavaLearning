package Logical_operators;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter the year you were born");

        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        System.out.println("Enter the month you were born (in form of a number)");
        int month = scan.nextInt();

        System.out.println("Enter the day of the month you were born");
        int day = scan.nextInt();
        scan.close();

        int currentYear = 2022;
        int currentMonth = 11;
        int currentDay = 23;

        int adult = currentYear - year;

        if (adult > 18) {
            System.out.println("You are an adult.");
        }
        else if ((adult == 18) && (month < currentMonth)) {
            System.out.println("You are 18 years old.");
        }
        else if ((adult == 18) && (month == currentMonth) && (day <= currentDay)) {
            System.out.println("You are 18 years old.");
        }
        else {
            System.out.println("You are a minor.");
        }

    }
}

