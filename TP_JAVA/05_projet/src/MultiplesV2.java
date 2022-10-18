package Exercice_5_Version1_0;

import java.util.Scanner;

public class MultiplesV2 {
	// static final int nbDiv=7;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir la valeur de nbDiv entre 1 et 100");
		int nbDiv = sc.nextInt();
		System.out.println("Affichage des MULTIPLES de: " + nbDiv + " entre 0 et 100\n");
		
		if(nbDiv<=100) {
			for (int x = 0; x <= 100; x++) {
				if (x % nbDiv == 0) {
					System.out.println("(" + x + ")\t");
				} else {
					System.out.println("" + x + "\t");
				}
			}
		}else {System.out.println("nbDiv incorrect");}
		
	}
}

