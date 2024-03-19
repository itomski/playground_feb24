package de.lubowiecki.playground.exceptions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionTest1 {

    public static void main(String[] args) {

        // Unchecked - Kompiler zwingt mich nicht zur Behandlung
        // int i = Integer.parseInt("Hallo"); // NumberFormatException
        String s = null;
        // System.out.println(s.toUpperCase()); // NullPointerException
        int[] arr = new int[10];
        // System.out.println(arr[20]); // ArrayIndexOutOfBoundsException
        // System.out.println(arr[-20]); // ArrayIndexOutOfBoundsException

        // arr = new int[-10]; // NegativeArraySizeException

        // Taucht eine Exception auf, wird die Abarbeitung sofort abgebrochen (wenn keine Gegenmaßnahmen erfolgen)

        // Checked - Der Kompiler erzwingt eine Behandlung
        // Ohne Behandlung kompiliert der Code nicht

        try {
            FileWriter out = new FileWriter("data.txt");
            out.append("Das ist das Haus von Nikigraus!");
            out.close();
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
            // Wird eine geworfene Exception gefangen, kann die Abarbeitung noch fortgesetz werden
            System.out.println("Probleme mit der Datei.");
            e.printStackTrace();
        }


    }
}
