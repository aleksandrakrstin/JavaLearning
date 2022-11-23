package Switch;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        System.out.println("Enter a day from Monday to Sunday:");

        Scanner scan = new Scanner(System.in);
        String day = scan.next();
        scan.close();

        switch (day) {
            case "monday":
                System.out.println("Today you have: ");
                System.out.println("a meeting with the clients at 11 AM");
                System.out.println("to go grocery shopping");
                break;
            case "tuesday":
                System.out.println("Today you have: ");
                System.out.println("a dentist appointment at 3 PM");
                break;
            case "wednesday":
                System.out.println("Today you have: ");
                System.out.println("a meeting with team members at 9.30 AM");
                System.out.println("a meeting with clients at 1 PM");
                System.out.println("to pay the bills ");
                break;
            case "friday":
                System.out.println("Today you have: ");
                System.out.println("call the restaurant for reservations");
                break;
            default:
                System.out.println("Today you have: ");
                System.out.println("Nothing scheduled");
        }
    }
}
