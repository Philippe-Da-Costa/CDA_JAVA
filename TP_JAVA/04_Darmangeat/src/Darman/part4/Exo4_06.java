package Darman.part4;
import java.util.Scanner;

public class Exo4_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double resultatCandidatUn,resultatCandidatDeux,resultatCandidatTrois,resultatCandidatQuatre;
		
		
         System.out.println("Entrer le score du candidat un au premier tour en %:");
         resultatCandidatUn = sc.nextDouble();
         System.out.println("Entrer le score du candidat deux au premier tour en %:");
         resultatCandidatDeux = sc.nextDouble();
         System.out.println("Entrer le score du candidat trois au premier tour en %:");
         resultatCandidatTrois = sc.nextDouble();
         System.out.println("Entrer le score du candidat quatre au premier tour en %:");
         resultatCandidatQuatre = sc.nextDouble();

        if (resultatCandidatUn+resultatCandidatDeux+resultatCandidatTrois+resultatCandidatQuatre > 100){
            System.out.println("Suspiscion de triche!!!");
            }else if(resultatCandidatUn >50){
            	System.out.println("Bravo candidat 1");
            	}else if(resultatCandidatUn<12.5 || resultatCandidatDeux>50 || resultatCandidatTrois>50 || resultatCandidatQuatre>50){
        			System.out.printf("Le 1er candidat est elimine");
        		}
        		else if(resultatCandidatUn>=resultatCandidatDeux && resultatCandidatUn>=resultatCandidatTrois && resultatCandidatUn>=resultatCandidatQuatre){
        			System.out.printf("Le 1er candidat est en ballotage favorable");
        		}
        		else {
        			System.out.printf("Le 1er candidat est en ballotage defavorable");
        		}

}
}
