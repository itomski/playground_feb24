package de.lubowiecki.playground.vererbung;

public class OverridingTest {

    public static void main(String[] args) {

        /*
        Fahrzeug f1 = new Fahrzeug();
        f1.geradeAus();
        f1.nachLinks();
        f1.nachRechts();

        System.out.println();

        f1 = new Ape();
        f1.geradeAus(); // Nutzt die überschriebene Methode
        f1.nachLinks();
        f1.nachRechts();

        System.out.println();

        f1 = new Ferrari();
        f1.geradeAus(); // Nutzt die überschriebene Methode
        f1.nachLinks();
        f1.nachRechts();
        */

        runSimulation(new Ferrari());
        runSimulation(new Ape());
        runSimulation(new Fahrzeug());
        runSimulation(new Rakete());
        // runSimulation(new String("Hallo")); // Error: ist nicht mit Fahrzeug verwandt

    }

    public static void runSimulation(Fahrzeug f) {
        f.geradeAus();
        f.nachLinks();
        f.nachRechts();
        System.out.println();
    }
}

class Fahrzeug {

    public void geradeAus() {
        System.out.println("Fährt mit 100 km/h gerade aus.");
    }

    public void nachRechts() {
        System.out.println("Fährt nach Rechts");
    }

    public void nachLinks() {
        System.out.println("Fährt nach Links");
    }
}

class Ape extends Fahrzeug {

    @Override // Diese Methode ersetzt die gerebte Methode aus der Elternklasse
    public void geradeAus() {
        System.out.println("Fährt mit 50 km/h gerade aus.");
    }
}

class Ferrari extends Fahrzeug {

    @Override
    public void geradeAus() {
        System.out.println("Fährt mit 250 km/h gerade aus.");
    }
}

class Rakete extends Fahrzeug {

    @Override
    public void nachLinks() {
        System.out.println("Geht nicht");
    }

    @Override
    public void nachRechts() {
        // super.nachLinks(); // Original-Methode aus der Elternklasse
        nachLinks();
    }
}
