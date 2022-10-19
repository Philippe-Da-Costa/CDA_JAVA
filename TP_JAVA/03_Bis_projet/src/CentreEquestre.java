import fr.afpa.outils.Console;

public class CentreEquestre {

	public static void main(String[] args) {
		//declaration des variables
		String nom, prenom;
		char rep;
				//Saisie
		do {
			System.out.println("\nNom du cavalier");
			nom = Console.in.readLine();
			System.out.println("\nPrenom du cavalier");
			prenom = Console.in.readLine();
					//Presentation
			System.out.println("\n\nCavalier");
			System.out.println("\t" + prenom+" "+nom);
					//message de fin
			System.out.println();
			System.out.println("\n\nDesirez vous continuer ?");
			rep = Console.in.readChar();
		}while(rep=='o');
			}

}
