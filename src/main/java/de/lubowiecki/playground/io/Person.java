package de.lubowiecki.playground.io;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable { // Serializable markiert Klassen als serialisierbar

    private String vorname;
    private String nachname;
    private LocalDate geburtsDatum;

    private Adresse adresse; // HAS-A

    public Person() {
    }

    public Person(String vorname, String nachname, LocalDate geburtsDatum, Adresse adresse) {
        this(vorname, nachname, geburtsDatum);
        this.adresse = adresse;
    }

    public Person(String vorname, String nachname, LocalDate geburtsDatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsDatum = geburtsDatum;
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

    public LocalDate getGeburtsDatum() {
        return geburtsDatum;
    }

    public void setGeburtsDatum(LocalDate geburtsDatum) {
        this.geburtsDatum = geburtsDatum;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append(", geburtsDatum=").append(geburtsDatum);
        sb.append(", adresse=").append(adresse);
        sb.append('}');
        return sb.toString();
    }
}
