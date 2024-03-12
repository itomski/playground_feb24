package de.lubowiecki.playground.api;

import java.util.HashSet;
import java.util.Set;

public class FahrzeugTest {

    public static void main(String[] args) {

        Fahrzeug f1 = new Fahrzeug("HH:AB123", "Ford", "Mustang", 1972);
        Fahrzeug f2 = new Fahrzeug("AB:CD789", "Fiat", "500", 2002, true);
        Fahrzeug f3 = new Fahrzeug("CD:EG177", "Renault", "Zoe", 2020);
        Fahrzeug f4 = new Fahrzeug("XY:Z1000", "Audi", "A4", 2021, true);
        Fahrzeug f5 = new Fahrzeug("CD:EG177", "Renault", "Zoe", 2020);

        // Menge
        Set<Fahrzeug> sammlung = new HashSet<>();
        sammlung.add(f1);
        sammlung.add(f2);
        sammlung.add(f3);
        sammlung.add(f4);
        sammlung.add(f5);

        //System.out.println(f3.equals(f5));

        // Hash basierte Strukturen führen nur equals aus, wenn der HashCode von zwei Objekten gleich ist

        // Gleicher HashCode bedeutet, dass zwei Objekt gleich sein könnten
        // Genaue Gleichheit wird dann im zwein Schritt mit equals geprüft

        for (Fahrzeug f: sammlung) {
            System.out.println(f);
        }

        System.out.println();

        String a = "Hi";
        String b = new String("Hi");
        System.out.println(a.hashCode() + " " + b.hashCode()); // gem. API Contract
        System.out.println(a.equals(b)); // true: Gleicher Inhalt
        System.out.println(a == b); // false - sind unterschiedliche Objekte auf dem Heap

        // hashCode und equals müssen nur in eigenen Klassen eingebaut werden

        System.out.println();

        Integer i1 = 100;
        //Integer i2 = Integer.valueOf(100); // Verwendet Objekt aus dem Pool... wenn vorhanden
        Integer i2 = new Integer(100); // Erzeugt ein neues Objekt auf dem Heap
        System.out.println(i1.hashCode() + " " + i2.hashCode()); // gem. API Contract
        System.out.println(i1.equals(i2)); // true: Gleicher Inhalt
        System.out.println(i1 == i2); // false - sind unterschiedliche Objekte auf dem Heap

    }
}
