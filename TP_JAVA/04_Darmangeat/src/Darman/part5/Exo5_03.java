package Darman.part5;

import java.util.Scanner;

public class Exo5_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Entre un nombre SVP : ");
		int nb = sc.nextInt();
		int nb2 = 1;
		while (nb2 <= 10) {
			System.out.println(nb + nb2);
			nb2++;
		}
	}
}
