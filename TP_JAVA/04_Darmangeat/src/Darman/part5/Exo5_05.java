package Darman.part5;

import java.util.Scanner;

public class Exo5_05 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Saisir le nombre afin d afficher sa table");
	int nb=sc.nextInt();
	
	for(int i=1; i<=10; i++) {
		System.out.println(nb+" X "+i+" = "+(nb*i));
	}
}
}
