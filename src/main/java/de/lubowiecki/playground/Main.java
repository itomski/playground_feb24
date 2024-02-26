package de.lubowiecki.playground;

public class Main {

    // Benennung von Klassen
    // PascalCase: FahrzeugVerwaltung (Beginnt mit Großbuchstaben, jedes neue Wort wieder groß)

    String name1 = new String("Hans");
    String name2 = new String("Peter");
    // String = Klassenname
    // name1 = Variablenname

    // camelCase: geburtsDatum (Beginnt mit Kleinbuchstaben, jedes neue Wort groß)
    // Wird für Variablen und Methodennamen verwendet


    // Einstiegspunkt in das Programm
    // Programme ohne main-Methode können nicht gestartet werden
    public static void main(String[] args) {

        // sout
        // Zeichenketten -> Strings: werden in "..." geschrieben
        System.out.println("Hallo Playground!");
        System.out.println(10 + 15);
        System.out.println(10 < 15); // println Ausgabe in einer neuen Zeile

        System.out.print(123); // Ohne Zeilenumbruch
        System.out.print(456);

        System.out.println(); // Zeilenumbruch

        String name = "Peter"; // Variable
        System.out.printf("Hallo, mein Name ist %s \n", name); // %s ist ein Platzhalter
        System.out.printf("Hallo %s. Wie geht es dir? \n", name); // \n ist ein Zeielnumbruch
        System.out.println("Hallo " + name + ". Wie geht es dir?");

        String stadt = "Hamburg";
        // Auf dem Objekt stadt wird die Methode toUpperCase() ausgeführt
        System.out.println(stadt.toUpperCase());

        // Manche Methoden können direkt auf der Klasse (hier Math) ausgeführt werden
        System.out.println(Math.random());

        System.out.println(add(10, 115)); // Java Compiler macht daraus Main.add()

        Main m = new Main(); // Objekterzeugung
        System.out.println(m.multi(10, 115)); // Methode wird auf dem Objekt ausgeführt

    } // Programm wird beendet, sobald das Ende der main-Methode erreicht wird

    // statische Methoden können auf der Klasse ausgeführt werden

    static int add(int a, int b) { // int ist eine Ganzzahl
        return a + b;
    }

    // für Nicht-statische Methoden braucht man ein Objekt
    int multi(int a, int b) {
        return a * b;
    }
}

/*
// Freie Funktionen gibt es in Java NICHT!
function add(a, b) {
    return a + b;
}

add(10, 15);
*/
