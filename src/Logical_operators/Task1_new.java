package Logical_operators;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task1_new {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    LocalDate now = LocalDate.now();
    System.out.println(now);

    System.out.println("Enter the date you were born in the following format: yyMMdd (no spaces)");
    int value = scan.nextInt();

    SimpleDateFormat originalFormat = new SimpleDateFormat("yyyyMMdd");
    Date date = originalFormat.parse(value.to;

  }
}
