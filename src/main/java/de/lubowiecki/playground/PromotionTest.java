package de.lubowiecki.playground;

public class PromotionTest {

    public static void main(String[] args) {

        byte b1 = 100;
        int i1 = 200;

        // automatisch: byte ist kleiner als int
        int sum = b1; // primitive widening von byte zu int

        sum = b1 + i1; // b1 wird auf den gleichen typ mit i1 gebracht
        sum = b1 + b1; // byte, short und char wrden zum Rechnen IMMER auf int angehoben

        // nicht automatisch: int ist größer als byte
        b1 = (byte)sum; // Ein cast ist notwendig - Datenverlußt möglich (Überlauf/Unterlauf)

        String s; // Deklaration - Kein Objekt gebaut und kein Speicher reserviert
        // Vor der Verwendung muss die Variable initialisiert werden
        s = "Hallo"; // Initialisierung. Zuweisung des Startwertes

        String s2 = "Moin"; // Deklaration und Initialisierung

        int zöhl = 100;
        int _zöhl = 100;
        int $zöhl = 100;
        int $ = 100;
        // int _ = 100; // AB Java 1.9 nicht mehr erlaubt

        // Zwei unterschiedliche Variablen
        int hi = 100;
        int Hi = 100;

        //double switch; // Schlüsselwort
        double swiTch; // kein Schlüsselwort


    }
}
