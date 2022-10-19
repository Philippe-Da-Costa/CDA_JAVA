package Darman.part6;

public class Exo6_06 {
//  Tableau Suite[7] en Entier ok
//  Variable i en Entier k
//  Début
//  Suite[0] ← 1 ok
//  Suite[1] ← 1 ok
//  Pour i ← 2 à 7 ok
//  Suite[i] ← Suite[i-1] + Suite[i-2]
//  i suivant ok
//  Pour i ← 0 à 7 ok
//  Ecrire Suite[i]
//  i suivant
//  Fin

  public static void main(String[] args) {
      int Suite[] = new int[7];
      int i;
      Suite[0] = 1;
      Suite[1] = 1;
      // <6 EQUIVAUT A <=7
      for (i = 2; i <= 6; i++) {
          Suite[i]= Suite[i-1]+Suite[i-2];
       }

     for(i=0;i<=6;i++){
         System.out.println(Suite[i]);
     }

  }

}
