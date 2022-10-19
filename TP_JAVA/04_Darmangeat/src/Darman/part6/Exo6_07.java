package Darman.part6;

import java.util.Scanner;

public class Exo6_07 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        double[] notes = new double[9];
        double sommeDesNotes = 0;

        for (int i = 0; i <= 8; i++) {
            System.out.printf("Entrer une note : ");
            notes[i] = sc.nextDouble();
            sommeDesNotes += notes[i];
        }

        for (double note : notes) {
            System.out.println(note);
        }

        double moyenne = sommeDesNotes / notes.length;

    //  System.out.printf("%.2f", moyenne);
        System.out.printf("moyenne de : %.2f /10", moyenne);
        sc.close();
    }
	}

