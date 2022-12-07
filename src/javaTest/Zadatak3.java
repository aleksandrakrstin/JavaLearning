package javaTest;

import java.util.Scanner;

public class Zadatak3 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int i = 1;
    int sum = 0;
    while (i > 0) {
      System.out.println("Please enter " + i + ". number:");
      int num1 = scan.nextInt();
        if (num1 == 0) {
        break;
      }
      sum = sum + num1;
      System.out.println("The sum is " + sum );
      i++;
      }
    }
  }
