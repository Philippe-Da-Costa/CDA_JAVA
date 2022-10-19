package Darman.part6;

public class Exo6_04 {
//  Que produit l’algorithme suivant ?
//    Tableau Nb[5] en Entier ok
//    Variable i en Entier ok
//    Début
//    Pour i ← 0 à 5
//    Nb[i] ← i * i
//    i suivant
//    Pour i ← 0 à 5
//    Ecrire Nb[i]
//    i suivant
//    Fin

//    Peut-on simplifier cet algorithme avec le même résultat ?


    public static void main(String[] args) {

        int[] Nb = new int[5];
        int i;

        for(i = 0 ; i <= 5 ; i++){
            System.out.println(Math.pow(i,2));
        }
    }
}
