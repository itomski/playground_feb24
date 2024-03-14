package de.lubowiecki.playground.vererbung;

import java.util.ArrayList;
import java.util.List;

public class FlughafenTest {

    public static void main(String[] args) {

        //A360 flugzeug1 = new A360();
        //Cessna172 flugzeug1 = new Cessna172();
        MilleniumFalke flugzeug1 = new MilleniumFalke();

        Flughafen berlin = new Flughafen();
        berlin.landen(flugzeug1);
        System.out.println(berlin.checkAnzahlFlugobjekte());

        System.out.println();

        berlin.serviceLeistung(flugzeug1);

        System.out.println();

        berlin.starten(flugzeug1);
        System.out.println(berlin.checkAnzahlFlugobjekte());
    }
}

class Flughafen {

    private List<FlughafenKompatibel> flugobjekte = new ArrayList<>();

    public void landen(FlughafenKompatibel flugobjekt) {
        flugobjekt.anfrageLandung();
        flugobjekt.fahrwerkAusfahren();
        flugobjekt.landen();
        flugobjekt.fahrbahnVerlassen();
        flugobjekte.add(flugobjekt);
    }

    public void starten(FlughafenKompatibel flugobjekt) {
        flugobjekt.anfrageStart();
        flugobjekt.fahrbahnBefahren();
        flugobjekt.starten();
        flugobjekte.remove(flugobjekt);
        flugobjekt.fahrwerkEinfahren();
    }

    public void serviceLeistung(Service obj) {
        obj.sicherheitsCheck();
        obj.auftanken();
    }

    public int checkAnzahlFlugobjekte() {
        return flugobjekte.size();
    }
}

class A360 implements FlughafenKompatibel {

    @Override
    public boolean anfrageStart() {
        System.out.println("Hallo Hallo... dürfen wir starten?");
        return true;
    }

    @Override
    public boolean anfrageLandung() {
        System.out.println("Hallo Hallo... dürfen wir landen?");
        return true;
    }

    @Override
    public boolean fahrwerkAusfahren() {
        System.out.println("Fahrwerk wird ausgefahren.");
        return true;
    }

    @Override
    public boolean fahrwerkEinfahren() {
        System.out.println("Fahrwerk wird eingefahren.");
        return true;
    }

    @Override
    public boolean landen() {
        System.out.println("Landebahn anvisieren.");
        System.out.println("Schub rausnehmen");
        System.out.println("aufsetzen");
        System.out.println("abbremsen");
        return true;
    }

    @Override
    public boolean fahrbahnVerlassen() {
        System.out.println("Landebahn verlassen.");
        return true;
    }

    @Override
    public boolean starten() {
        System.out.println("Schub erhöhen");
        System.out.println("abheben");
        System.out.println("abdrehen");
        return true;
    }

    @Override
    public boolean fahrbahnBefahren() {
        System.out.println("Landebahn befahren.");
        return true;
    }

    @Override
    public boolean sicherheitsCheck() {
        System.out.println("Sicherheit wird geprüft");
        return true;
    }

    @Override
    public boolean auftanken() {
        System.out.println("Wird wieder voll betankt");
        return true;
    }
}

class Cessna172 implements FlughafenKompatibel {


    @Override
    public boolean anfrageStart() {
        System.out.println("Moin... Ich will hier weg... hymm... ???");
        return true;
    }

    @Override
    public boolean anfrageLandung() {
        System.out.println("Moin... Darf ich hier landen... hymm... ???");
        return true;
    }

    @Override
    public boolean fahrwerkAusfahren() {
        System.out.println("Ist konstant ausgefahren");
        return false;
    }

    @Override
    public boolean fahrwerkEinfahren() {
        return fahrwerkAusfahren();
    }

    @Override
    public boolean landen() {
        System.out.println("Aufsetzen");
        System.out.println("Abbremens");
        return true;
    }

    @Override
    public boolean fahrbahnVerlassen() {
        System.out.println("Abfahrt nehmen");
        return true;
    }

    @Override
    public boolean starten() {
        System.out.println("Gas geben");
        System.out.println("Abheben");
        return true;
    }

    @Override
    public boolean fahrbahnBefahren() {
        System.out.println("Landebahn befahren");
        return true;
    }

    @Override
    public boolean sicherheitsCheck() {
        System.out.println("Was? So teuer? Dann lieber nicht!");
        return true;
    }

    @Override
    public boolean auftanken() {
        System.out.println("100 Liter bitte!");
        return true;
    }
}

class MilleniumFalke implements FlughafenKompatibel {


    @Override
    public boolean anfrageStart() {
        System.out.println("Solo hier! Wir starten!");
        return true;
    }

    @Override
    public boolean anfrageLandung() {
        System.out.println("Solo hier! Wir landen!");
        return true;
    }

    @Override
    public boolean fahrwerkAusfahren() {
        System.out.println("Haben wir nicht");
        return true;
    }

    @Override
    public boolean fahrwerkEinfahren() {
        System.out.println("Haben wir nicht");
        return true;
    }

    @Override
    public boolean landen() {
        System.out.println("Aufsetzen");
        return true;
    }

    @Override
    public boolean fahrbahnVerlassen() {
        System.out.println("Nö. Wir bleiben hier");
        return true;
    }

    @Override
    public boolean starten() {
        System.out.println("Abheben");
        return true;
    }

    @Override
    public boolean fahrbahnBefahren() {
        System.out.println("Nö. Wir stehen immer noch an gleicher Stelle");
        return true;
    }

    @Override
    public boolean sicherheitsCheck() {
        System.out.println("Nö. Das machen wir selbst");
        return true;
    }

    @Override
    public boolean auftanken() {
        System.out.println("Nö. Danke. Das hast zu wenig Oktan!");
        return true;
    }
}

interface FluglotzenKommunikation {

    boolean anfrageStart();

    boolean anfrageLandung();

}

interface Fahrwerk {

    boolean fahrwerkAusfahren();

    boolean fahrwerkEinfahren();
}

interface Landbar {

    boolean landen();

    boolean fahrbahnVerlassen();
}

interface Startbar {

    boolean starten();

    boolean fahrbahnBefahren();
}

interface Service {

    boolean sicherheitsCheck();

    boolean auftanken();
}

interface FlughafenKompatibel extends FluglotzenKommunikation, Landbar, Startbar, Fahrwerk, Service {
}


