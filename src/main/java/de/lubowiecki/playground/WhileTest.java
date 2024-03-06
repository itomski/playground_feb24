package de.lubowiecki.playground;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WhileTest {

    public static void main(String[] args) {

        final boolean run = true; // Kompiletimekonstante: Der Kompiler kennt den Wert und Datentyp

        final boolean nextRun;
        nextRun = true; // Runtimekonstante: Der Kompiler kennt nur den Datentyp

        //while(nextRun) { // Endlosschleife
        //}
        //System.out.println("Hallo");

        int i = 0;
        while(i < 5) {
            i++;
        }

        List<String> namen = new ArrayList<>();
        namen.add("Peter");
        namen.add("Carol");
        namen.add("Bruce");
        namen.add("Natasha"); // Elemente werden hinzugefügt

        Iterator<String> itr = namen.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next()); // Versetzt den Iterator auf das nächste Element
        }

        LocalTime stop = LocalTime.now().plusSeconds(10);

        System.out.println(LocalTime.now());
        System.out.println(LocalTime.now().withNano(0));

        // Kopfgesteuert
        while(LocalTime.now().isBefore(stop)) {
            System.out.println("Warten...");
        }
        System.out.println("Stop...");


        int j = 0;
        // Fußgesteuert: wird mind. 1x ausgeführt
        do {
            int x = 0;
            System.out.println("Hi: " + j++);
        }
        while(j < 10); // x ist hier nicht mehr verfügbar
    }
}
