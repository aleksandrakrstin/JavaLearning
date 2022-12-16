package IfElse;

public class Zadatak8 {
    public static void main(String[] args) {
        int x = 10;
        int y = 23;
        int z = 99;

       if (x < y && y < z && x < z) {
           System.out.println("Values are in an increasing order.");
       } else if (x > y &&  y > z && x > z) {
           System.out.println("Values are in a decreasing order.");
       } else {
           System.out.println("Values not sorted.");
       }
    }
}
