package Darman.part5;

import java.util.Scanner;

public class Exo5_06 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Saisir un nombre SVP :");
		int nb=sc.nextInt();
		
		int somme =0;
		for(int i=1;i<=nb;i++) {
			somme=somme+i;
		}
		System.out.println("Somme total:"+ somme);
	}
}
