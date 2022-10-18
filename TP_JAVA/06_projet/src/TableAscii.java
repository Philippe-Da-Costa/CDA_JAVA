
public class TableAscii {

	public static void main(String[] args) {
	
		char caractere;
		int ligneTaille= 0;
		final int ELEMENTS_MAX=3;
		
		for (caractere=33;caractere<=126 ;caractere++ )
		{
		if(ligneTaille == ELEMENTS_MAX) {
			System.out.println("");
			ligneTaille= 0;
		}ligneTaille++;
		
			System.out.print("'"+caractere 
				+"'\t"+ 
				Integer.toHexString(caractere)+
				"\t"+
				Integer.toString(caractere)+"\t\t"
				);
			}
		}
	}


