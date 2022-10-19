package Darman.part5;
import java.util.Scanner;
public class Exo5_10 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("montant achat : ");
        int prixApayer = sc.nextInt();
        System.out.println("montant payé");
        int montantAchat = sc.nextInt();

        int montantRemboursement = prixApayer - montantAchat;

        while (montantRemboursement >= 50)
        {
            System.out.println("rendu 50€");
            montantRemboursement -= 50;
        }
        while (montantRemboursement >= 20)
        {
            System.out.println("rendu 20€");
            montantRemboursement -= 20;
        }
        while (montantRemboursement >= 10)
        {
            System.out.println("rendu 10€");
            montantRemboursement -= 10;
        }
        while (montantRemboursement >= 5)
        {
            System.out.println("rendu 5€");
            montantRemboursement -= 5;
        }
        while (montantRemboursement >= 2)
        {
            System.out.println("rendu 2€");
            montantRemboursement -= 2;
        }
        while (montantRemboursement == 1)
        {
            System.out.println("rendu 1€");
            montantRemboursement -= 1;
        }


    }
}
