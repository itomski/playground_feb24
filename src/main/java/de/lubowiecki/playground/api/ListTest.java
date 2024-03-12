package de.lubowiecki.playground.api;

import java.util.*;

public class ListTest {

    public static void main(String[] args) {

        // abstracte Konstrukte: Interface und abstrakte Klasse
        List<String> namen = new ArrayList<>(100); // Standard initCapacity = 10
        System.out.println(namen.size());
        System.out.println(namen); // toString

        namen.add("Peter");
        namen.add("Bruce");

        //namen.addAll(Arrays.asList("Natasha", "Carol", "Bruce"));
        namen.addAll(List.of("Natasha", "Carol", "Bruce")); // Ab Java 1.9

        System.out.println(namen.size());
        System.out.println(namen);

        System.out.println();

        // Nur für Arrays und Listen möglich
        for (int i = 0; i < namen.size(); i++) {
            System.out.println(namen.get(i));
        }

        System.out.println();

        // Gut für Arrays und alle Collections
        for (String n : namen) {
            System.out.println(n);
        }

        System.out.println();

        namen.forEach(n -> System.out.println(n)); // Mit Lambda

        System.out.println();

        // Mit Streams
        namen.stream()
                .parallel() // Kann auch parallel erfolgen
                .forEach(n -> System.out.println(n));


        System.out.println();

        Iterator<String> itr = namen.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("------------------");

        // Arrays.asList und List.of Erzeugen eine FixedSizeListe
        List<String> andereNamen = List.of("Natasha", "Carol", "Bruce");
        // andereNamen.add("Max"); // UnsupportedOperationException

        //Set<String> namenMenge = Set.of("Natasha", "Carol", "Bruce");

        // Referenztyp: Object
        // Objekttyp: String
        Object o = new String("Moin");

        // List<Object> objekte = new ArrayList<>();
        List objekte = new ArrayList(); // Unsave Variante, verwendet Object
        objekte.add("Hallo");
        objekte.add(123); // Autoboxing von int zu Integer
        objekte.add(12.34); // Autoboxing von double zu Double
        objekte.add(new Mensch("Tony", "Stark"));

        for (Object obj : objekte) {
            // System.out.println(obj); // Der Kompiler kennt hier nicht den konkreten Typ des Objektes
            //System.out.println(((String)obj).toUpperCase());
            if(obj instanceof String) { // Testet den Typ auf dem Heap
                System.out.println(((String)obj).toUpperCase());
            }
        }

        // Reflection
        //String s = "Hallo Welt";
        StringBuilder s = new StringBuilder("Hallo Welt");
        Class c = s.getClass(); // Reflection Object. Class ist ein Objekt, dass die Beschreibung der Klasse enthält
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());
    }
}
