package de.lubowiecki.playground;

public class OverloadingTest {

    public static void main(String[] args) {
        new OverloadingTest().start(); // Erzeugt ein Objekt und startet eine Instanzmethode
    }

    private void start() {
        // Hier können Instanzmethoden verwendet werden
        // Beim Aufruf einer Instanzmethode wird automatisch this vorgesetzt

        // byte < short < int < long < float < double
        //         char <

        // Standard für Ganzzahlen ist int
        // Standard für Dezimalwerte ist double

        byte b = 10;
        run(b);

        run((byte)10);

        run(10);

        run(10.0);

        run(10.0f); // float

        run(10_000_000_000_000l); // long

        // Beim Überladen/Overloading muss die Parameterliste unterschiedlich sein
        // Anzahl, Typen oder Reihenfolge
        // Gibt es für einen primitiven Typ keine passende Methode, dann wird primitive widening benutzt
        // primitive widening: Zahl promoviert zum nächsthöheren primitiven Datentyp

        // 15.0 ist ein double
        // 15.0f ist ein float
        // 2 ist ein int
        // 2l ist ein long

        double sum = 10 + 15.0; // int promoviert zu double

        byte b1 = 10;
        byte b2 = 15;

        byte bSum = (byte)(b1 + b2); // byte und short werden zum rechnen in int umgewandelt

        int i = 1000;
        System.out.println((byte)i); // Überlauf

        System.out.println();

        b1 = 126;
        System.out.println(b1++); // b1 = (byte)(b1 + 1);
        System.out.println(b1++);
        System.out.println(b1++);
        System.out.println(b1++);

        b1 += 10; // b1 = (byte)(b1 + 10);

        // 10++; // geht nur mit Variablen
    }


    private void run(byte v) {
        System.out.println("byte");
    }

    private void run(char v) {
        System.out.println("char");
    }

    /*
    private void run(int v) {
        System.out.println("int");
    }

    private void run(long v) {
        System.out.println("long");
    }
    */

    private void run(double v) {
        System.out.println("double");
    }

    private void run(float v) {
        System.out.println("float");
    }
}
