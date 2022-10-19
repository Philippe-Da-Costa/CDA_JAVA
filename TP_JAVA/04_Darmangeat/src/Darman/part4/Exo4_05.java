package Darman.part4;

import java.util.Scanner;

public class Exo4_05 {
	 

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	
	    	 boolean Homme;
	    	 int age ;
	    	 boolean imposable;

	        System.out.println("Êtes-vous un homme ou une femme? (homme/femme)");
	         Homme = sc.nextLine().equals("homme");

	        System.out.println("Quel age avez-vous?");
	        age = sc.nextInt();

	        

	        if( (imposable = Homme && age >20) || ( !Homme && age >= 18 && age <= 35)   ){
	            System.out.println("Imposable !! ");
	        } else {
	            System.out.println("Non imposable !");
	        } 
	    }}
