package Darman.part5;

import java.util.Scanner;

public class Exo5_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nb;
		do {
			System.out.printf("Entre un entier entre 1 et 3 : ");
			nb=sc.nextInt();
		}
		while(!(nb>=1&&nb<=3));
			
		System.out.printf("\nTon entier est le %d",nb);
		sc.close();
	}
	
}