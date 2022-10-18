package Darman.part5;

import java.util.Scanner;

public class Exo5_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 while (true){
	            System.out.println("Taper un numéro compris entre 10 et 20");
	            int numero = sc.nextInt();

	            if (numero > 20){
	                System.out.println("Plus petit!");
	            } else if (numero < 10){
	                System.out.println("Plus grand!");
	            } else{
	                System.out.println("Merci !");
	                break;
	                }
	            }
		 }
	}


