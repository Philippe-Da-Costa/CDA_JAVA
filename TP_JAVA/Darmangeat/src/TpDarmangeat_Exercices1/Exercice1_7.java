package TpDarmangeat_Exercices1;

public class Exercice1_7 {
	public static void main(String[] args) {
		int A = 10;
		int B = 20 ;
		int C = 30 ;
		//j'utilise une variable intermediaire afin de stocker la valeur de C
		int D = C ;
		C=B;
		B=A;
		A=D;
		
		System.out.println("La variable A vaut: " +A+
		           "\nLa variable B vaut: "+B+
		           "\nLa variable C vaut: "+C);
	}
}
