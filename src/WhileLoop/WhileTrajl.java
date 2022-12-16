package WhileLoop;

import java.util.Scanner;

public class WhileTrajl {
  public static void main(String[] args) {
    int sum = 0;
    Scanner scan = new Scanner(System.in);

    while (true) {
      System.out.println("Enter a number:");
      int input = scan.nextInt();
      sum += input;

      System.out.println("Press 1 if you want to continue.");
      System.out.println("Press 0 if you want to finish.");
      int input2 = scan.nextInt();
      if (input2 == 0) {

        System.out.println(sum);
        break;
      }
    }
  }
}
