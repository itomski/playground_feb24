package de.lubowiecki.playground.api;

import com.google.common.base.MoreObjects;

import java.util.Objects;

class Mensch {

    // Instanz-Konstanten müssen spätestens im Konstruktor initialisiert werden
    private final String vorname;

    private final String nachname;

    public Mensch(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    // Solange keine eigene toString-Methode vorhanden ist, wird die aus Objekt verwendet
    /*
    @Override
    public String toString() {
        return vorname + " " + nachname;
    }
    */

    /*
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mensch{");
        sb.append("vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append('}');
        return sb.toString();
    }
    */

    /*
    @Override
    public String toString() { // Apache Commons Lang
        // TODO: Bla bla bla
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
    */

    @Override
    public String toString() { // Guava
        return MoreObjects.toStringHelper(this)
                .add("vorname", vorname)
                .add("nachname", nachname)
                .toString();
    }

    // equals und hashCode werden immer zusammen implementiert
    // und basieren auf gleichen Eigenschaften

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mensch mensch = (Mensch) o;
        // Objects ist eine Utility-Klasse mit statischen Hilfsmethoden
        return Objects.equals(vorname, mensch.vorname) && Objects.equals(nachname, mensch.nachname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vorname, nachname);
    }
}
