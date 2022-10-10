package TpDarmangeat_Exercices1;

public class Exercice1_4 {
	public static void main(String[] args) {
		int A=3;
		int B= 10;
		int C= A+B;
		B=A+B;
		A=C;
		System.out.println("La variable A est: "+A+
						   "\nLa variable B est: "+B+
						   "\nLa variable C est: "+C);
	}
}
