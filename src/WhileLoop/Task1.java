package WhileLoop;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum = 0;

        while(true) {

            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            sum += num;
            System.out.println("The sum is: "+sum);

            if (num <= 0) {
            break;
        }
    }



    }


}
