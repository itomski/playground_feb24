package de.lubowiecki.playground.api;

import java.time.LocalDate;

public class StringBuilderTest {

    public static void main(String[] args) {

        // StringBuilder hat ein internes Array von Zeichen mit einer capacity

        StringBuilder sb1 = new StringBuilder(); // capacity: 16 (default)
        StringBuilder sb2 = new StringBuilder("Das ist das"); // capacity: 27 (Anzahl Zeichen + 16)
        StringBuilder sb3 = new StringBuilder(100); // capacity: 100

        // Das interne Array wird beim Bedarf vergrößert
        // Alte capacity * 2 + 2

        sb1.append("Das ist das Haus von Nikigraus."); // Verändert den StringBuilder
        System.out.println(sb1.capacity());
        sb1.append("... und so weiter... ");
        sb1.append("und so weiter. Hauptsache irgendwelche Zeichen...");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());

        System.out.println();

        sb2.append(" Dies").append(" Das").append(123); // Richtig
        sb2.append(" Dies" + " Das" +  123); // Falsch

        System.out.println(sb2); // toString wird automatisch verwendet

        //String output = sb2; // StringBuilder ist kein String
        String output = sb2.toString(); // toString produziert einen String aus dem Inhalt des StringBuilders

        //LocalDate.now() // Factory

        System.out.println();

        sb3.append("Das ist das Haus von Nikigraus"); // Fügt Inhalt ans Ende hinzu
        sb3.delete(0, 10); // Löscht
        System.out.println(sb3);
        sb3.insert(0, "Das ist "); // Fügt Inhalt an einer bestimmten Stelle ein
        System.out.println(sb3);
        sb3.replace(10, 15, "..."); // Ersetzt Inhalt
        System.out.println(sb3);
        sb3.reverse(); // Dreht die Reihenfolge um
        System.out.println(sb3);

        System.out.println();

        // StringBuffer ist wie StringBuilder, aber Threadsicher

        StringBuilder sb4 = new StringBuilder();
        System.out.println(sb4.capacity());
        sb4.ensureCapacity(17); // Sichert, dass die capacity ausreichend groß ist
        // Führt ein mal die Vergrößereung nach ner Regel alte capacity * 2 + 2
        // Oder wenn das nicht ausreicht, wird es direkt auf die passende Größe gesetzt
        System.out.println(sb4.capacity());
        sb4.append("abcdefghijk");
        System.out.println(sb4.capacity());
        System.out.println(sb4.length());
        sb4.trimToSize(); // Kürzt die capacity auf die Anzahl der Zeichen
        System.out.println(sb4.capacity());

        sb4.setLength(5); // Inhalt wird nach 5 Zeichen abgeschnitten
        System.out.println(sb4);
        System.out.println(sb4.capacity());
        System.out.println(sb4.length());

        CharSequence seq = "Hallo";
        seq = new StringBuilder("Hi");

        sb4.append(seq);
    }
}
