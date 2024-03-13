package de.lubowiecki.playground.vererbung;

public class InterfaceTest {

    public static void main(String[] args) {

        /*
        Rechner r = new ProtokollRechner();
        System.out.println(r.add(10, 15));
        System.out.println(r.div(10, 15));
        System.out.println(r.multi(10, 15));
        System.out.println(r.sub(10, 15));
        */

        startRechner(new Superrechner());
        System.out.println();
        startRechner(new ProtokollRechner());

    }

    private static void startRechner(Rechner r) {
        // Das Interface verpflichtet eine Klasse zum umsetzen seiner Methoden
        // Das Interface legt fest, welche Methoden es geben muss
        // aber nicht, wie sie ausprogrammiert sein sollen
        System.out.println(r.add(10, 15));
        System.out.println(r.div(10, 15));
        System.out.println(r.multi(10, 15));
        System.out.println(r.sub(10, 15));
    }

}

interface Rechner {

    // Alle Methoden in einem Interface sind automatisch public

    // Alle abstrakte Methoden müssen durch erbende Klassen eingebaut werden
    // Statische Methoden im Interface gehören nur dem Interface
    // Alle default Methoden können, müssen aber nicht eingebaut werden
    // Alle Eigenschaften im Interface sind automatisch public static final

    double add(double a, double b); // abstrakte Methode

    double div(double a, double b);

    double multi(double a, double b);

    double sub(double a, double b);

}

// Interfaces werden nicht erweitert sondern implementiert
class Superrechner implements Rechner {


    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double div(double a, double b) {
        return a / b;
    }

    @Override
    public double multi(double a, double b) {
        return a * b;
    }

    @Override
    public double sub(double a, double b) {
        return a - b;
    }
}

class ProtokollRechner implements Rechner {

    private StringBuilder protokoll = new StringBuilder();

    @Override
    public double add(double a, double b) {
        double res = a + b;
        appendToProtokoll(a, b, "+", res);
        return res;
    }

    @Override
    public double div(double a, double b) {
        double res = a / b;
        appendToProtokoll(a, b, "/", res);
        return res;
    }

    @Override
    public double multi(double a, double b) {
        double res = a * b;
        appendToProtokoll(a, b, "*", res);
        return res;
    }

    @Override
    public double sub(double a, double b) {
        double res = a - b;
        appendToProtokoll(a, b, "-", res);
        return res;
    }

    private void appendToProtokoll(double a, double b, String op, double res) {
        protokoll.append(a).append(op).append(b).append(" = ").append(res).append("\n");
        System.out.println(protokoll);
    }
}