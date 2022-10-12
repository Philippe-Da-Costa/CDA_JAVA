public class Item5 {
    public static void main(String[] args) {
		
		System.out.println("5 exemples avec Math");
		 System.out.println();
		 double a =30;
		 double b = Math.toRadians(a);
		
		 System.out.println( "2 puissance 2 = "+(int) Math.pow(2,2));
		 System.out.println();
		 System.out.println( "racine carree de 9 = "+(int) Math.sqrt(9));
		 System.out.println();
		 System.out.println( " cosinus de b = "+ Math.cos(b));
		 System.out.println();
		 System.out.println( " radians de a = "+ Math.toRadians(a));
		 System.out.println();
		 System.out.println("la valeur de pi est: " + (double) Math.PI);
		 System.out.println();
		 System.out.println("Affiche un nombre aleatoire ");
	  for ( int i=1; i<=5; i++ ){
	  System.out.println((int)(Math.random()*(10)+1));
	   
	  }
	   
    }
}