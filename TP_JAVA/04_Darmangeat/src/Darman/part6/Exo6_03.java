package Darman.part6;

import java.util.Arrays;
import java.util.Scanner;

public class Exo6_03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] notes=new int[9];
		int i=0;
		for(double note:notes) {
			
			System.out.printf("Entrer une note : ");
			notes[i]=sc.nextInt();
			i++;
		}
		System.out.printf("notes=%s\n",Arrays.toString(notes));
		
		sc.close();
		}
	}
