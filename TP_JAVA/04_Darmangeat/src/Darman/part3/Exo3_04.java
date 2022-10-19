package Darman.part3;
import java.util.Scanner;
public class Exo3_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nb;
		System.out.print("Saisir un nombre:  ");
		nb=sc.nextInt();
		if (nb<0){
			System.out.println("Ce nombre est négatif");
		}else if(nb>0) {
			System.out.println("Ce nombre est positif");
		}else {
			System.out.println("Ce nombre est nul");
		}
		
		}
}
