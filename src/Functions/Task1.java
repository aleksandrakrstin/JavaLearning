package Functions;

import java.util.Scanner;
import java.lang.Math;

public class Task1 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Please, enter a number:");
    int x = scan.nextInt();

    System.out.println("Please, enter another number:");
    int y = scan.nextInt();

    System.out.println("Now choose one of the following operations, and enter it below: ");
    System.out.println("addition");
    System.out.println("subtraction");
    System.out.println("multiplication");
    System.out.println("division");
    System.out.println("modulus");
    System.out.println("exponentiation");
    System.out.println("floor_division");
    System.out.println("Please, enter one of the operations above:");

    String operation = scan.next();
    scan.close();

    switch (operation) {
      case "addition":
        addNums(x, y);
        break;
      case "subtraction":
        subtractNums(x, y);
        break;
      case "multiplication" :
        multiplyNums(x, y);
        break;
      case "division":
        divideNums(x, y);
        break;
      case "modulus":
        moduleNums(x, y);
        break;
      case "exponentiation":
        exponentiateNums(x,y);
        break;
      case "floor_division":
        divisionFloor(x, y);
        break;
      default:
        System.out.println("Invalid entry. Please try again.");
    }
  }
  public static void addNums (int x, int y) {
    int sum = x + y;
    System.out.println("The result is " + sum);
  }
  public static void subtractNums (int x, int y) {
    int sub = x - y;
    System.out.println("The result is " + sub);
  }
  public static void multiplyNums (int x, int y) {
    int mul = x * y;
    System.out.println("The result is " + mul);
  }
  public static void divideNums (int x, int y) {
    int div = x / y;
    System.out.println("The result is " + div);
  }
  public static void moduleNums (int x, int y) {
    int mod = x % y;
    System.out.println("The result is " + mod);
  }
  public static void exponentiateNums (int x, int y){
    Math.pow(x, y);
    int resPow = (int) Math.pow(x, y);
    System.out.println("The result is " + resPow);
  }
  public static void divisionFloor (int x, int y) {
    double floor = Math.floor(x/y);
    System.out.println("The result is " + floor);
  }
}
