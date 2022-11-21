package IfElse;

public class Zadatak6 {
    public static void main(String[] args) {

        String name = "Milan";
        String lastName = "Jovanovic";
        int birthYear = 2005;
        int currentYear = 2022;
        int age = (currentYear - birthYear);

        String user = name + " " + lastName;

        if (age >= 18) {
            System.out.println(user + " is and adult.");
        } else {
            System.out.println(user + " is a minor.");
        }


    }
}
