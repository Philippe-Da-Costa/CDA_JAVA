package Darman.part2;
import java.util.Scanner;
public class Exo2_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrer votre prénom ?");
		String name = sc.nextLine();
		System.out.println("Bonjour "+name+" !");
	}
}
