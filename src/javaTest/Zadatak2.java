package javaTest;

import java.util.Scanner;

public class Zadatak2 {
  public static void main(String[] args) {
    double motorQuote = 5.0 / 100.0;
    double carQuote = 7.0 / 100.0;
    double vanQuote = 11.0 / 100.0;
    double truckQuote = 15.0 / 100.0;

    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the distance in km:");
    int distance = scan.nextInt();

    while (true) {
      System.out.println("Please enter the type of vehicle: motorcycle / car / van / truck");
      String vehicle = scan.next();

      if (vehicle.equals("motorcycle")) {
        double motoConsumption;
        motoConsumption = (distance * motorQuote);
        System.out.println("The consumption of a motorcycle for " + distance + " km is " + motoConsumption + "l");
      }
      else if (vehicle.equals("car")) {
        double carConsumption;
        carConsumption = distance * carQuote;
        System.out.println("The consumption of a car for " + distance + " km is " + carConsumption + "l");
        break;
      }
      else if (vehicle.equals("van")) {
        double vanConsumption;
        vanConsumption = distance * vanQuote;
        System.out.println("The consumption of a van for " + distance + " km is " + vanConsumption + "l");
        break;
      }
      else if (vehicle.equals("truck")) {
        double truckConsumption;
        truckConsumption = distance * truckQuote;
        System.out.println("The consumption of a truck for " + distance + " km is " + truckConsumption + "l");
        break;
      }
      else {
        System.out.println("You entered a wrong vehicle type. Please try again.");
      }
    }


  }
}

