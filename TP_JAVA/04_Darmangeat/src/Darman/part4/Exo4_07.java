package Darman.part4;

import java.util.Scanner;

public class Exo4_07 {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Quel est votre age SVP ?");
	int age=sc.nextInt();
	System.out.println("Depuis combien d annee detenez vous votre permis de conduire ?");
	int permisDepuis =sc.nextInt();
	System.out.println("Combien d accident responsable avez vous eu?");
	int nbAccident =sc.nextInt();
	System.out.println("  Vous etes  assurer depuis:");
	int anciennete =sc.nextInt();
			
	//Augmentation  bonus
	boolean cas1 = (age>=25) ;
    boolean cas2 = (permisDepuis>=2);
    boolean cas3 = (anciennete >5);
    
    //points
    int nbPoint = 1;
    nbPoint=cas1? nbPoint+1 : nbPoint;
    nbPoint=cas2? nbPoint+1 : nbPoint;
    
    nbPoint= nbPoint-nbAccident;
    nbPoint=cas3 && nbPoint>=1 ? nbPoint+1 : nbPoint;
    String tarif ="";
    switch (nbPoint) {
    	case 4: 
    		tarif="Bleu";
    		break;
    	case 3: 
    		tarif="vert";
    		break;
    	case 2: 
    		tarif="orange";
    		break;
    	case 1: 
    		tarif="rouge";
    		break;
    	case 0: 
    		tarif="Non assurable";
    		break;
    	default:
    		tarif="Donnee incomplete";
    	}
    System.out.println(tarif);
    }
}
