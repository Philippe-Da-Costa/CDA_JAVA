import java.util.Scanner;

public class Version1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String nom, prenom, adresse, numCarteFNTE,nomChevaux  ;

		char rep;
		
		do{     //Saisie
			System.out.print("nom du cavalier: ");
			nom=sc.nextLine();

			System.out.print("Prenom du cavalier: ");
			prenom=sc.nextLine();

			System.out.print("adresse du cavalier: ");
			adresse=sc.nextLine();
			System.out.print("noms des trois chevaux préférés: ");
			nomChevaux=sc.nextLine();

			System.out.println("numero de la carte FNTE du cavalier \t: ");
			numCarteFNTE =sc.nextLine();





				//presentation
			System.out.print("Cavalier n°: " +numCarteFNTE);
			System.out.println( "\n\t"+prenom+ " " + nom.toUpperCase()
								+"\n\t"+ adresse
								+"\n\tChevaux : "+ nomChevaux
								);
			
				//message de fin
			System.out.print("\n\nCVoulez-vous continuer (O/N) ? ");
			rep = sc.nextLine().charAt(0);
			
			}while (rep=='o');
			sc.close();
			}
}
	