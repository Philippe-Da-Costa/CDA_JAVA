package Darman.part4;

import java.util.Scanner;

public class Exo4_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		int    jourMax;
		//boolean bissexstil =false;
		
		System.out.print("saisir le jour: ");
		int jour=sc.nextInt(); 
		System.out.print("saisir le mois: ");
		int  mois=sc.nextInt();
		System.out.print("saisir l'annee: ");
		int  annee=sc.nextInt();
		
		boolean jourValide = jour <=31;
		boolean moisValide  = mois<=12;
		boolean bissexstil = ((annee %4== 0 ) &&(!(annee %100==0)) ||(annee %400==0)) ;	
		
		if ( (jourValide) && (moisValide) && (bissexstil)) { 
			System.out.println("ok");
			}else {
			System.out.println("non valide");
		}
		
}}
