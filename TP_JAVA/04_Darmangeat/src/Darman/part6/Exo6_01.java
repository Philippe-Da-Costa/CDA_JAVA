package Darman.part6;

import java.util.Arrays;

public class Exo6_01 {
	public static void main(String[] args) {
		int[] monTab= {0,0,0,0,0,0,0,};
		//FOREACH
		for(int tableDeZero:monTab) {
			System.out.print(tableDeZero+" ");
		}
		
		//en utilisant les methodes de ARRAYS 
		System.out.println();
		System.out.println("Avec la methode \"fill\" ");
		
		int [] tabDeZero=new int [7];
		Arrays.fill(tabDeZero, 0);
		for(int el:tabDeZero)
			System.out.print(el);
		}
	}
