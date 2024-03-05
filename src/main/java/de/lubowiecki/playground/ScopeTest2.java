package de.lubowiecki.playground;

public class ScopeTest2 {

    public static void main(String[] args) {

        if(true) {
            String s = "Hallo";
        }
        // s ist out of scope: Objekt auf dem Heap steht für GC zur Verfügung

        String s = "Hi";
        s = null; // Objekt auf dem Heap wird von der Referenz getrennt und steht für GC zur Verfügung

        int ganzAndererWert;

        while(true) {

            int andererWert = 200;
            ganzAndererWert = 500;

            if(true) {
                int wert = 100;
                System.out.println(andererWert); // hier sichtbar, weil es in einem höheren Scope deklariert wurde
                ganzAndererWert = 1000;
            }
            //System.out.println(wert); // nicht sichtbar, weil der Scope beendet ist
        }

        //for (int i = 0; i < 100; i++) {
        //}

    }





}
