package de.lubowiecki.playground;

public class ScopeTest {

    public static void main(String[] args) {

        int z = 100;

        if(z > 200) { // unterblock der main-Methode
            System.out.println(z); // z ist hier sichtbar
            int x = 150; // Lokale Variablen sind nur im Block sichtbar, in dem sie deklariert wurden
        }

        // System.out.println(x); // x ist hier schon out-of-scope
        System.out.println(z); // z ist noch bis zum Ende des main-Blocks sichtbar

        // Variablen, die out-of-scope sind, werden vom Stack entfernt

        {
            int[] zahlen = new int[100_000]; // Speicher für 100_000 ints wird reserviert
            zahlen[80_000] = 250;
            System.out.println(zahlen[80_000]);
        }
        // System.out.println(zahlen); // nicht mehr verfügbar
        // zahlen Variable ist out-of-scope d.h. Speicher wird wieder freigegeben

        String s = "Hallo Scope!";
        Object o = new Object();

    }
}
