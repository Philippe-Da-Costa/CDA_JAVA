package Darman.part5;

import java.util.Scanner;

public class Exo5_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("saisir le nombre ");
		int nb = sc.nextInt();

		for (int i = 1; i < 20; i++) {
			System.out.println("saisir le nombre " + (i + 1));
			int nb2 = sc.nextInt();
			if (nb2 > nb) {
				nb = nb2;
				}
			}
		System.out.println("le plus grand des nombres saisis est: " + nb);
	}
}
