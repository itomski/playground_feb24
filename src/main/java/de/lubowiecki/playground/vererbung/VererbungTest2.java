package de.lubowiecki.playground.vererbung;

import java.time.LocalDate;

public class VererbungTest2 {

    public static void main(String[] args) {

        Lebenwesen l1 = new Mensch(); // Jeder Mensch ist ein Lebewesen!
        l1 = new Tier(); // Jeder Tier ist ein Lebewesen!

        Tier t1 = new Tier();
        //t1 = new Lebenwesen(); // Error: Nicht jedes Lebewesen ist ein Tier! Error

        // Sollte zur Laufzeit festgestellt werden, dass hier l1 kein Tier auf dem Heap liegt
        // gibt es eine ClassCastException!
        t1 = (Tier)l1;


        System.out.println();

        Tier t2 = new Tier();
        t2.setGeburtsDatum(LocalDate.now());
        t2.setName("Sabaka");
        t2.setGattung(Gattung.HUND);



    }
}

class Lebenwesen {

    private LocalDate geburtsDatum;

    public Lebenwesen() {
        System.out.println("C Lebewesen");
    }

    public LocalDate getGeburtsDatum() {
        return geburtsDatum;
    }

    public void setGeburtsDatum(LocalDate geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
    }
}

class Mensch extends Lebenwesen {

    private String id;

    private String vorname;

    private String nachname;

    public Mensch() {
        System.out.println("C Mensch");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
}

class Tier extends Lebenwesen {

    private Gattung gattung = Gattung.UNBEKANNT;

    private String name;

    public Tier() {
        // super(); // Aufruf des Konstruktors der Elternklasse
        System.out.println("C Tier");
        System.out.println(super.toString()); // super ist eine Referenz auf ein Objekt der Elternklasse
    }

    public Gattung getGattung() {
        return gattung;
    }

    public void setGattung(Gattung gattung) {
        this.gattung = gattung;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

enum Gattung {
    HUND, KATZE, ALPAKA, VOGEL, WOLF, UNBEKANNT;
}
