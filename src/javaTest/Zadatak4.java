package javaTest;

import java.util.Scanner;

public class Zadatak4 {
  public static void main(String[] args) {
    double euroQuote = 0.0085;
    double francQuote = 0.0093;
    double dollarQuote = 0.010;

    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter the amount in RSD you wish to convert:");
    double amount = scan.nextInt();

    System.out.println("Please enter the currency you wish to convert your RSD amount to:");
    System.out.println("Our available currencies are: euro / franc / dollar");
    String currency = scan.next();
    scan.close();

    double quote;

    if (currency.equals("euro")) {
      quote = euroQuote;
    }
    else if (currency.equals("franc")) {
      quote = francQuote;
    }
    else if (currency.equals("dollar")) {
      quote = dollarQuote;
    } else {
      quote = 0;
      System.out.println("You have entered incorrect currency.");
      return;
    }
    System.out.println(myCurrency(amount, quote));
  }
  public static double myCurrency(double amount, double selectedQuote) {
    return amount * selectedQuote;
  }
}
