package de.lubowiecki.playground;

// Jede Klasse ist in Java von der Klasse Object abgeleitet
// und bekommt diverse Methoden vererbt
public class DestructTest {

    public static void main(String[] args) throws InterruptedException {

        DestructTest dt = new DestructTest();
        System.out.println(dt.hashCode()); // hashCode ist eine Methode, die von Objekt geerbt wurde

        dt = null; // Ab hier ist das Objekt auf dem Heap für GC verfügbar
        System.gc(); // GC wird aufgefordert den Müll zu entsorgen

        Thread.sleep(2000); // Der aktuell laufende Prozess wartet 2 Sekunden
    }

    public DestructTest() {
        // super(); // Konstruktor der Elternklasse wird verwendet
    }

    @Override
    protected void finalize() { // Wird von GC verwendet, wenn das Objekt vom Speicher entfernt wird
        System.out.println("UGRRRRR!!!!!!");
    }
}
