package Darman.part2;
import java.util.Scanner;

public class Exo2_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ht;
		int qte;
		double TVA;
		double TTC;
		
		System.out.print("saisir le prix hors taxe : ");
		ht=sc.nextFloat();
		System.out.print("saisir la quantite d articles : ");
		qte=sc.nextInt();
		System.out.print("saisir le taux de la tva : ");
		TVA=sc.nextFloat();
        double totalHt= qte*ht;
        System.out.printf("Le total taxes comprisent est de %.2f Euros",totalHt +( ht*(TVA/100)));
        
		/*System.out.print("Le total taxes comprisent est de : ");
		System.out.println( totalHt +( ht*(TVA/100))+" Euros" );*/
		//System.out.println( "Le prix hors taxe est de "+(qte*ht)+ ((qte*ht)* (TVA/100))+" Euros");
	}

}

