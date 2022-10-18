package Darman.part5;

import java.util.Scanner;

public class Exo5_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir un nombre SVP");
		int nb = sc.nextInt() + 1;
		int nb2 = nb + 10;
		for (int i = nb; i < nb2; i++) {
			System.out.println(i);
		}
	}
}
