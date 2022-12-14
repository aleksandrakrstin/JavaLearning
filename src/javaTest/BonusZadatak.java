package javaTest;

public class BonusZadatak {
  //Napisati funkciju koja prima dva niza od po 10 brojeva i vraca koliko istih brojeva postoji u oba niza.
//Primer:
//Niz A: 1, 12, 7, 3, 5, 8, 9, 11, 321, 5
//Niz B: 4,6,7,8,12, 15, 34,1, 2, 503
//Funkcija primi ova dva niza i vrati da postoji 4 ista broja u ova dva niza

  public static void main(String[] args) {
    int[] a = {1, 12, 7, 3, 5, 8, 9, 11, 321, 5};
    int[] b = {4,6,7,8,12, 15, 34,1, 2, 503};

    System.out.println(countEqualelements(a, b));
  }
  public static int countEqualelements(int[] x, int[] y){
    int countSameNums = 0;
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < y.length; j++) {
        if (x[i] == y[j]) {
          countSameNums++;
        }
      }
    } return countSameNums;
  }
}
