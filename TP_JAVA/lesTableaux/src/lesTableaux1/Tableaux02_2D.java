package lesTableaux1;
//TABLEAUX A DEUX DIMENSIONS
public class Tableaux02_2D {

	public static void main(String[] args) {
		
		int[][] tab = {
			//2 lignes 3 colonnes
				{1, 2, 3},  
				{4, 5, 6}}; 
		    // syntaxe sans initialisation
		    // 1er crochet nb lignes 2eme crochet nb colonne
		    // int[][] tab =  new int [2][3]; 
		
		   //////// AFFICHAGE CHIANT!!!!
		System.out.println("CLASSIC");
		   System.out.println(tab[0][0]);
		   System.out.println(tab[0][1]);
		   System.out.println(tab[0][2]);
		   System.out.println(tab[1][0]);
		   System.out.println(tab[1][1]);
		   System.out.println(tab[1][2]);
		   
		   ///////PARCOURIR AVEC BOUCLE FOR
		 System.out.print("AVEC FOR ");
		    for(int i=0;i<tab.length;i++)
		    	for(int j=0;j<tab[i].length;j++)
		    { System.out.print(tab[i][j]+"  ");}
		    
		///////PARCOURIR AVEC BOUCLE FOR
		    System.out.println();
		    System.out.print("AVEC FOREACH ");
		for(int[] tab2d:tab)
			for(int number:tab2d)
			System.out.print("  "+number);
		
		
		

	}

}
