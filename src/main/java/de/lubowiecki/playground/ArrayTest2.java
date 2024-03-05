package de.lubowiecki.playground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest2 {

    public static void main(String[] args) {

        final String[] arr = new String[5];
        // arr = new String[10]; // Referenz darf kein neues Array zugewiesen bekommen
        // Inhalt des Arrays darf sich aber ändern

        arr[3] = "Peter";
        System.out.println(Arrays.toString(arr));

        List<String> liste = new ArrayList<>();
        liste.add("Tony");
        liste.add("Carol");

        System.out.println(liste.contains("Carol"));
        System.out.println(liste);


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println();

        for(String name : arr) {
            System.out.println(name);
        }
        // Variable name aus der Schleife ist hier out-of-scope

        System.out.println();

        for(String name : liste) {
            System.out.println(name);
        }

        int[] iarr1;
        int iarr2[];

        int x = 1, y[] = {1,2,3}, z = 5; // x und z sind ints und y ist ein int-Array
        // int[] x, y, z; // Alle Variablen sind int-Arrays

        List<String> namen = new ArrayList<>(List.of("Peter", "Carol", "Tony"));

        String[] produkte = {"Tasse", "Wecker", "Brot"}; // neur bei Neudeklaration möglich
        produkte = new String[]{"...", "...", "..."};
        produkte = new String[3]; // Erzeugt ein leeres Array

        String[] fahrzeuge;
        // fahrzeuge = {"Volvo", "Ford", "Fiat"}; // Nicht erlaubt! Variable ist berets deklariert
        fahrzeuge = new String[]{"Volvo", "Ford", "Fiat"};


    }
}
