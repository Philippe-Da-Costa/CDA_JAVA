// Declaraton de la Classe principale de l'app
public class Arguments 
{
	//Point d'entrée de l'app
	public static void main(String [] args)
	{
		for (int i=0; i<args.length; i++)
		System.out.println("argument " + i + "= " +args[i]);
		//conversion de deux arguments de la ligne de commande de String vers int, puis addition des valeurs entieres , et affichage du resultat
		int somme;
		somme = (Integer.parseInt(args[3])) + 
				(Integer.parseInt(args[4]));
		System.out.println("Arguments 3 + Arguments 4 =   " +somme);
		}
	}
