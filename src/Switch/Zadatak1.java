package Switch;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        System.out.println("Enter a number from 1 to 7:");

        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        scan.close();

        switch (day) {
            case 1:
                System.out.print("Monday is the first day of the week.");
                break;
            case 2:
                System.out.println("Tuesday is the second day od the week.");
                break;
            case 3:
                System.out.println("Wednesday is the third day of the week.");
                break;
            case 4:
                System.out.println("Thursday is the fourth day of the week.");
                break;
            case 5:
                System.out.println("Friday is the fifth day of the week.");
                break;
            case 6:
                System.out.println("Saturday is the sixth day of the week.");
                break;
            case 7:
                System.out.println("Sunday is the last day of the week.");
                break;
        }
    }
}
