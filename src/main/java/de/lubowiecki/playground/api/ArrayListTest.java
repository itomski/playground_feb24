package de.lubowiecki.playground.api;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        // Generische Tyopen sind immer komplex
        // Für primitive Datentypen werden die Wrapper verwendet
        // ArrayList<GenerischerTyp>
        //ArrayList<Integer> zahlen = new ArrayList<Integer>(); // Bis Java 1.6
        ArrayList<Integer> zahlen1 = new ArrayList<>(); // Ab Java 1.7
        zahlen1.add(5);
        zahlen1.add(7);
        zahlen1.add(15);

        // Error: Referenz ist vom Typ ArrayList
        //zahlen1 = new LinkedList<>(zahlen1);

        // In der Praxis
        // Auf der linken Seite verwendet man den InterfaceTyp
        List<Integer> zahlen2 = new ArrayList<>();
        zahlen2.add(5);
        zahlen2.add(7);
        zahlen2.add(15);
        zahlen2 = new LinkedList<>(zahlen2); // Wechsel von ArrayList auf LinkedList
        zahlen2 = new ArrayList<>(zahlen2); // Wechsel von LinkedList auf ArrayList

        // Listen haben einen Index
        System.out.println(zahlen2.get(1));
        zahlen2.add(1,17); // Zahlen nach Position 1 werden nach rechts verschoben
        System.out.println(zahlen2);
        zahlen2.set(1, 25); // Ersetzt das Element an Position 1
        System.out.println(zahlen2);
        zahlen2.remove(2); // Entfernt das Element an Position 2
        zahlen2.remove(Integer.valueOf(15)); // Entfernt das Element mit dem Inhalt 15
        System.out.println(zahlen2);

        // Interne capacity von ArrayList ist nach Außen nicht sichtbar

        zahlen2 = new ArrayList<>(); // Internes Array hat die seize 10
        zahlen2 = new ArrayList<>(100); // Internes Array hat die seize 100
    }
}
