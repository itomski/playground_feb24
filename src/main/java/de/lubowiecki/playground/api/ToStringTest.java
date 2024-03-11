package de.lubowiecki.playground.api;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToStringTest {

    public static void main(String[] args) {

        // Immutable
        Mensch spiderman = new Mensch("Peter", "Parker");
        Mensch hulk = new Mensch("Bruce", "Banner");

        System.out.println(spiderman); // toString wird automatisch verwendet
        System.out.println(hulk);

        List<String> namen = new ArrayList<>();
        namen.add("Natasha");
        namen.add("Tony");
        namen.add("Carol");
        System.out.println(namen); // hier wird die toString-Methode der ArrayList verwendet

        LocalDate heute = LocalDate.now();
        System.out.println(heute); // hier wird die toString-Methode der LocalDate verwendet


    }

}

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

    @Override
    public String toString() {
        // TODO: Bla bla bla
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}

