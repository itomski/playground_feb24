package de.lubowiecki.playground;

import java.util.Locale;

public class StringTest {

    public static void main(String[] args) {

        String s1 = "Hamburg"; // Landet im String-Literal-Pool
        //String s2 = new String("Hamburg");
        String s2 = "Hamburg";
        String s3 = new String("Hamburg"); // Landet nicht im String-Pool

        // Bei Objekten
        System.out.println(s1 == s2); // Referenzgleichheit
        // Zeigen beide Referenzen auf das gleiche Objekt auf dem Heap?

        System.out.println(s1.equals(s2)); // Inhaltsgleichheit
        // Haben die beiden Objekte den gleich Zustand?

        System.out.println();

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        System.out.println();

        // Bei primitiven Datentypen
        int a = 100;
        int b = 100;
        double d = 100.0;
        System.out.println(a == b); // Wertevergleich
        System.out.println(a == d); // a wird zu double angehoben

        System.out.println();

        String s4 = "Das ist das Haus von Nikigraus!";
        System.out.println(s4.toUpperCase());
        System.out.println(s4.toLowerCase());
        System.out.println(s4.indexOf("Haus"));
        System.out.println(s4.charAt(0));
        System.out.println(s4.replace("Haus", "Palast"));
        System.out.println(s4.endsWith("graus!"));
        String s5 = String.format("Das ist das Haus von %s", "Peter");
        System.out.println(s5.join(" - ", "Peter", "Bruce", "Carol"));

        String[] namen = {"Peter", "Bruce", "Carol"};

        System.out.println(s5.join("... ", namen));

        System.out.println();

        String template = "| %-10s | %-10s | %10.2f € |";
        System.out.println(String.format(template, "Brot", "Dinkel", 3.99));
        System.out.println(String.format(template, "Milch", "3% Fett", 0.99));
        System.out.println(String.format(template, "Butter", "Süßrahm", 2.2));

        System.out.println();

        // Strings sind IMMUTABLE = Nicht änderbar
        // Änderungen an Immuutable-Objeten erzeugen IMMER eine neue Version des Objekts

        String s6 = "Hallo";
        // s6 + " Welt";
        s6.concat(" Welt");
        s6 = s6.concat(" Welt"); // Muss auf die alte Referenz zugewiesen werden
        System.out.println(s6);

        //System.out.println("Das ist das" + " Haus" + " von Nikigraus");

    }
}
