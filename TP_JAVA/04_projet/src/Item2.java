import java.util.Scanner;

public class Item2 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	//String operateur1="*";
	
	System.out.println("Saisir operande 1");
	int nb1=sc.nextInt();
	System.out.println("Saisir operande 2");
	int nb2=sc.nextInt();
	sc.nextLine();
	System.out.println("Saisir operateur ");
	String operateur =sc.nextLine();
	
	if( operateur.equals("*")) {
		System.out.println( nb1*nb2);
	}else if ( operateur.equals("+")) {
		System.out.println( nb1+nb2);
	}else if(operateur.equals("-")) {
		System.out.println( nb1-nb2);
	}else if (operateur.equals("/") && (nb2==0)) {
		System.out.println( "Division par zero IMPOSSIBLE!!!");
	}else {System.out.println( nb1/nb2);}
}
}
