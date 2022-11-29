package Do_While_Loop;

import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int sum = 0;

    do {
      System.out.println("Enter a number: ");
      int num1 = scan.nextInt();

      sum += num1;

      System.out.println("Press 1 if you want to continue.");
      System.out.println("Press 0 if you want to finish.");

      int input = scan.nextInt();

      if (input == 0) {

        System.out.println("The sum is " + sum);
        break;
      }
    } while (true);
  }
}
