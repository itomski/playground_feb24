package de.lubowiecki.playground;

import java.util.Scanner;

public class FehlerEingabe {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new FehlerEingabe().start();
    }

    private void start() {

        /*
        while(true) {
            try {
                System.out.print("Eingabe: ");
                int zahl = scanner.nextInt();
                System.out.println(zahl);
                break;
            } catch (Exception e) {
                System.out.println("Fehler bei Eingabe");
                scanner.nextLine(); // Eingabe leeren
            }
        }
        */

        Produkt p = new Produkt("Taschenlampe", 100, 19.99);
        System.out.println(p);
        p = new Produkt("Taschenmesser", 100, 12.99);
        System.out.println(p);
        p = new Produkt("Tasse, gelb", 100, 5.99);
        System.out.println(p);

    }
}

class Produkt {

    private String name;
    private int menge;
    private double preis;

    public Produkt(String name, int menge, double preis) {
        this.name = name;
        this.menge = menge;
        this.preis = preis;
    }

    @Override
    public String toString() {
        return String.format("| %-15s | %-5d | %8.2f |", name, menge, preis);
    }
}
