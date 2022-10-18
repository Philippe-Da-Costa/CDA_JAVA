import java.util.Scanner;

public class Item1 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	//declaration de mes variables
	final double TAUX_DOLLAR=0.97;
	
	System.out.println("Saisir un prix en \"EUROS\": ");
	double	prixEuros=sc.nextDouble();
	//conversions
	double convertDollars = (prixEuros*TAUX_DOLLAR);
	
	if(prixEuros<1000){
		System.out.printf("La converion en Dollars est : %.2f $",convertDollars);
	}else if((prixEuros>=1000 )&& (prixEuros<1000000)) {
		System.out.printf("La converion en Dollars est : %.2f K$",convertDollars/1000);
		}else if ((prixEuros>=1000000)&&(prixEuros<1000000000)) {
			System.out.printf("La converion en Dollars est : %.2f M$",convertDollars/1000000);
		}
}}



