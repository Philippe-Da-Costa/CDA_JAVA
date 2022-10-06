import java.util.Scanner;
public class AfficheTableCalcul {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int nbMax;

        System.out.println("Enter nombre max");
        nbMax = myObj.nextInt();

        for (int i=1;i<=nbMax;i++){
            int puissance = (int) Math.pow(i,2);
            float carree = (float) Math.sqrt(i);
            System.out.print("calcul 1 a 1: " + i+"........");
            System.out.print("calcul de  " + i + " puissance 2: " + puissance +"......");
            System.out.println("calcul de la  racine carree de " + i + ": " + carree);
        }
 }
}