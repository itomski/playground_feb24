package de.lubowiecki.uebung1;

public class InstanzRechner {

    // Methoden sind Funktionen, die in zu einer Klasse gehören
    public double add(double a, double b) { // Methode
        return a + b;
    }

    // Instanzmethoden werden auf einem Objekt der Klasse ausgeführt
    // InstanzRechner r1 = new InstanzRechner() // Objekterzeugung
    // r1.add(10, 15) // Ausführung der Methode
    public double sub(double a, double b) {
        return a - b;
    }

    public double multi(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }
}
