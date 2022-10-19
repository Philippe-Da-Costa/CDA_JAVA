package lesTableaux1;

import java.util.Arrays;

/*
  OBJECTS  classe mere de tableau 
  tableau herite de methodes  equals(verifie les egalites), 
  toString(permet d afficher sous dorme de caractere un oblet classe )
 */

//creation d une methode permettant l affichage de mon tableau
public class Tableaux03CasPratique {
	public static void afficheTableau(int[] t) {
		for(int el:t) {
			System.out.println(el);
		}
		}

	public static void main(String[] args) {
		int[]tab= {1, 2, 3, 4, 5};
		afficheTableau(tab);
		
		int[]tab2= {6, 7, 8, 9, 10};
		System.out.println(tab2.toString());//affiche l adresse memeoire
		
		int[]tab3=new int [10] ;
		Arrays.fill(tab2,15);
		for(int el:tab2)
		System.out.println(el);
		
	}
	
	
	
	
	

}
