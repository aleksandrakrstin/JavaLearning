package For_each_Loop;

public class Task1 {
  public static void main(String[] args) {

    int[] num = {3, 54, 67, 11, 22, 106, 4};

    for (int i : num) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
  }
}
