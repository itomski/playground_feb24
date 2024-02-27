package de.lubowiecki.uebung2;

import java.util.Random;

public class Zufall {

    public static void main(String[] args) {

        Random rand = new Random();
        System.out.println(rand.nextInt(10)); // Zufallszahl zwischen 0 und 10 (10 exclusive)
        System.out.println(rand.nextInt(10));
        System.out.println(rand.nextInt(10));
        System.out.println(rand.nextInt(10) + 1); // Zufallszahl zwischen 1 und 10

        int i = (int)(Math.random() * 10) + 1;
        System.out.println(i);

        // Array = Sammlung von Werten gleichen Typs
        int arr[] = new int[5]; // Ein int-Array mit 5 Plätzen
        arr[0] = 10; // Position 0 ist die erste Position
        arr[1] = 7; // Wertzuweisung
        arr[2] = 5;
        arr[3] = 8;
        arr[4] = 2;

        System.out.println(arr[3]); // lesen an Position 3

        int anzahl = 5;
        String namen[] = new String[anzahl];

        // Alle Plätze im Array werden zugewiesen
        for (int j = 0; j < namen.length; j++) {
            namen[j] = "...";
        }

        // Kann auch als Rückgabetyp genutzt werden z.B. int[], double[], String[], Person[]

        // Ausgabe von Arrays
        for (int j = 0; j < namen.length; j++) {
            System.out.println(namen[j]);
        }
    }
}
