package de.lubowiecki.playground.api;

public class StringTest {

    public static void main(String[] args) {

        String s = "Hallo";
        String sCopy = s;

        String s2 = s.toUpperCase(); // Erzeugt eine neue Version des Strings
        // Nach der Erzeugung der neuen Version muss diese wieder auf eine Referenz zugewiesen werden

        // Alle Stringmanipulationen produzieren einen neuen String auf dem Heap
        s2 = s.substring(2); // Liefert einen Ausschnitt

        s2 = s.trim().toLowerCase().substring(3,4); // Startindex incl., Endindex excl.

        System.out.println(s);
        System.out.println(sCopy);

        System.out.println(s.endsWith("a")); // false
        System.out.println(s.startsWith("H")); // true
        System.out.println(s.indexOf("o")); // Position des ersten Vorkommens eines Zeichens oder einer Zeichenkette
        System.out.println(s.lastIndexOf("l")); //Position des letzten Vorkommens eines Zeichens oder einer Zeichenkette
        System.out.println(s.length()); //Länge der Zeichenkette
        System.out.println(s.charAt(3)); // Zeichen an gewünschter Position

        // Muster überprüfen
        s = "Hall1";
        System.out.println(s.matches("[a-zA-Z]{5}")); // sind es 5 Buchstaben (klein oder Groß)
        s = "zzzzy";
        System.out.println(s.matches("[x|z]{5}")); // sind es 5 Buchstaben (z oder x)

        // String hat auch statische Methoden
        System.out.println(String.join(", ", "Peter", "Bruce", "Carol"));
        System.out.println(String.format("Der Peris ist %.2f € \n", 19.2345));

        String s3 = "Wort";
        System.out.println(s3 + " " + s3);
        System.out.println(s3.concat(" ").concat(s3));

        String s4 = "Hi"; // Landet im String-Literal-Pool
        String s5 = new String("Hi"); // Landet NICHT im String-Literal-Pool

    }
}
