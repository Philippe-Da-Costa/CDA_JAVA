package Darman.part1;

public class Exo1_06 {
	public static void main(String[] args) {
		int A=10;
		int B=20;
		//j'utilise une variable intermediaire afin de stocker la valeur de A
		int C=A;
		A=B;
		B=C;
		System.out.println("La variable A vaut: " +A+
		           		   "\nLa variable B vaut: "+B);
	}
}
