package javaTest;

public class Zadatak1 {
  public static void main(String[] args) {

    int[] nums = {3, 5, 4, 11, -1, 23, 5, 43, 0, 5};
    int arrayMinimum = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length; i++) {
      int currentNum = nums [i];

      if (currentNum < arrayMinimum) {
        arrayMinimum = currentNum;
      }
    }
    System.out.println(arrayMinimum);





  }
}
