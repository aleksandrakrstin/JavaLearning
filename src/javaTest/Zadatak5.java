package javaTest;

import java.util.Scanner;

public class Zadatak5 {
  public static void main(String[] args) {

    int[] arr = {2, 12, 432, 21, 2, 7, 12, 2, 21, -2};

    System.out.println("Please enter the number you want to search for in the array:");
    Scanner scan = new Scanner(System.in);
    int numInput = scan.nextInt();
    scan.close();
    minValue(arr,numInput);
  }

  public static int minValue(int[] arr, int numInput) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) { //enhanced for loop instead??
      if (arr[i] == numInput) {
        count++;
      }
    }
    if (count >= 1) {
      System.out.print("The entered number " + numInput + " is repeated " + count + " time(s) in the array.");
    } else {
      System.out.print("The entered number is not found in the array.");
    }
    return count;
  }
}
