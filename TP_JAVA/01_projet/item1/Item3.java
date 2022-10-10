public class Item3 {
    public static void main(String[] args) {
       byte c = 50;
       byte d = 70;
	   byte e;
	   c=70;
	   e = (byte)( c + d);
        System.out.println("valeur de e: "+e);
    }
}

//Explication le byte est sur 1 octet.
//valeur du byte  -128 a 127
// quand on redefinit la valeur de c on sort de la capacité d'un byte.
// effectivement 70 + 70 font 140 nous somme au dessus de la capacité d un byte.