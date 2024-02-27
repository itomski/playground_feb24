package de.lubowiecki.uebung1;

// de.lubowiecki.uebung1.Rechner

public class Rechner { // Klasse

    // Methoden sind Funktionen, die in zu einer Klasse gehören
    public static double add(double a, double b) { // Methode
        return a + b;
    }

    // Statische Methoden (Klassenmethoden) werden auf der Klasse ausgeführt
    // Methode wird direkt auf dem Bauplan ausgeführt, es gibt kein Objekt
    // Rechner.add(10, 15)
    public static double sub(double a, double b) {
        return a - b;
    }

    public static double multi(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }
}
