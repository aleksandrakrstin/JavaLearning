package javaTest;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak5 {
  public static void main(String[] args) {

    //Generate int array of random numbers
    //User types in the number to check if it is contained in the array
    //Counting if it is in the array and how many times repeated
    //If number is not in the array, it is printed out to user

    int[] nums = {2, 12, 432, 21, 2, 7, 12, 2, 21, -2};

    System.out.println("Please enter the number you want to search for in the array:");
    Scanner scan = new Scanner(System.in);

    int numInput = scan.nextInt();
    scan.close();

    int count = 0;
    do {
      System.out.println("The number " + numInput + " is repeated " + (count) + " times in the array.");
      count++;
    } while(binarySearch(nums, numInput));



    if (true) {
      System.out.println(search(nums, numInput));
    }
    if (false)  {
      System.out.println("The number " + numInput + " is not found in the array");
      }
  }
  public static boolean search(int[] array, int numToSearchFor) {
    for (int i = 0; i <= array.length; i++) {
      if (array[i] == numToSearchFor) {
        System.out.println("The number " + numToSearchFor + " is repeated " + (i) + " times in the array.");
        return true;
      }
    }
    return false;
  }
  public static boolean binarySearch(int[] array, int numToSearchFor) {
    Arrays.sort(array);
    int index = Arrays.binarySearch(array, numToSearchFor);
    if (index >=0) {
      return true;
    } else{
      return false;
    }
  }
}
