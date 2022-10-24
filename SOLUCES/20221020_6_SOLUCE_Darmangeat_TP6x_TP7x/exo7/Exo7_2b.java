package part07_technique_rusee;

/* ----------------------------------------------------
Exercice 7.2
Ecrivez un algorithme qui trie un tableau dans l�'ordre d�croissant 
Vous �crirez bien entendu deux versions de cet algorithme,
l'une employant le tri par insertion, l'autre le tri � bulles. 

------------------------------------------------------*/

public class Exo7_2b
{
public static void main(String[] args)
	{
	
	// ----------- D�claration et impl�mentation du tableau ------
	
	int[] tab = {16,18,15,9,11,10,17};

	int dimTab = tab.length;
	
/*	int T;																
	System.out.println("Entrez le nb de valeurs que vous souhaitez saisir:");

	T=(new java.util.Scanner(System.in)).nextInt();
	int[] tab=new int[T];
		
	System.out.println("\nSaisie du tableau");
	for ( int i=0 ; i< T ; i++ ) 
			{
			System.out.println("Saisir la valeur n�"+(i+1)+":");
			tab[i]=(new java.util.Scanner(System.in).nextInt());
			}*/
	
	// ---------------- Tri du tableau par bulles ---------
	
	int swap;
	boolean flag = true;
	
	while ( flag == true )
	{
		flag = false ;
		for ( int i=0 ; i < (dimTab-1) ; i++ )
		{
			if ( tab[i] > tab [i+1])
			{
				swap = tab[i];//sauvegarde
				tab[i] = tab[i+1];
				tab[i+1] = swap;
				
				flag = true;
			}
		}
	}
		
	//------------------ Affichage du tableau tri� --------------
	
	System.out.println("Tableau tri� :\n");
	for ( int itab : tab )
		System.out.println(itab);
	 }
}
