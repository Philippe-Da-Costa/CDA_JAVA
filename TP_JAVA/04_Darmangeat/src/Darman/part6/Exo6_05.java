package Darman.part6;

public class Exo6_05 {
//  Tableau N[6] en Entier
//  Variables i, k en Entier
//  Début
//  N[0] ← 1 ok
//  Pour k ← 1 à 6 ok
//  N[k] ← N[k-1] + 2 ok
//  k Suivant ok

//  Peut-on simplifier cet algorithme avec le même résultat ?


  public static void main(String[] args) {

      int[] N = new int[6];
      int i, k;

      N[0] = 1;
      // n[0] = 1

      for (k = 1; k <= 5; k++) {// k = 1
          // POUR k = 1
          // N[1] = N[1-1] + 2
          // N[10 = N[0] + 2
          // N[10] = 1 + 2
          // 3

          N[k] = N[k - 1] + 2;
          System.out.println(N[k]);
      }

      //    Pour i ← 0 à 6
      //    Ecrire N[i]
      //    i suivant
      //    Fin

      for (i = 0; i <= 5; i++) {
          System.out.println(N[i]);
      }
  }
}
