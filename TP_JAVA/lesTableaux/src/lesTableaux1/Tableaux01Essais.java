package lesTableaux1;

public class Tableaux01Essais {

	public static void main(String[] args) {
			int []tab= {1,2,3};
			//parcour des elements de mon tableau  !!commence a l indice 0!!
			System.out.println("CLASSIC");
			System.out.println(tab[0]);//element1 =1 
			System.out.println(tab[1]);//element1 =2 
			System.out.println(tab[2]);//element1 =3 
			
			//factoriser le parcour du code avec une boucle for
			System.out.print("AVEC FOR ");
			for(int i=0;i<tab.length;i++) {
				System.out.print(tab[i]); }
			System.out.println(); 
			
			//factoriser le parcour du code avec une boucle "forEach"
			System.out.print("AVEC FOREACH ");
			for(int el:tab)
			System.out.print(" "+el);
			
			
	}

}
