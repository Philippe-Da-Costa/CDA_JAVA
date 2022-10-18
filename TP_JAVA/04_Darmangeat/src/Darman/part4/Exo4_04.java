package Darman.part4;

import java.util.Scanner;

public class Exo4_04 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("saisir le nombre de copie");
	int nbCopies=sc.nextInt();
	
	if (nbCopies <=10) { 
		System.out.printf("le prix a payé est: %.2f € " ,nbCopies*0.10 );
		}else if( nbCopies <=20){ 
		System.out.printf("le prix a payé est: %.2f € " , nbCopies * 0.9);
	}else {
		System.out.printf("le prix a payé est: %.2f € " , nbCopies * 0.8);
	}
}}
 