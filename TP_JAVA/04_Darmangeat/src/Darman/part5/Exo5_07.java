package Darman.part5;
import java.util.Scanner;
public class Exo5_07 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Saisir un nombre SVP");
	int nb=sc.nextInt();
	int fact=1;
	for(int i=2;i<=nb;i++) {
		fact=fact*i;
	}
	System.out.printf("Le factoriel de "+nb+" est: " +fact);
}
}
