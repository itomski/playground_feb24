package de.lubowiecki.playground.api;

import java.util.Objects;

public class Fahrzeug {

    private String kennzeichen;
    private String marke;
    private String typ;
    private int baujahr;
    private boolean fahrBereit;

    public Fahrzeug(String kennzeichen, String marke, String typ, int baujahr) {
        this(kennzeichen, marke, typ,baujahr, false); // Verwendet den anderen Konstruktor
    }

    public Fahrzeug(String kennzeichen, String marke, String typ, int baujahr, boolean fahrBereit) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.typ = typ;
        this.baujahr = baujahr;
        this.fahrBereit = fahrBereit;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public boolean isFahrBereit() {
        return fahrBereit;
    }

    public void setFahrBereit(boolean fahrBereit) {
        this.fahrBereit = fahrBereit;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fahrzeug{");
        sb.append("kennzeichen='").append(kennzeichen).append('\'');
        sb.append(", marke='").append(marke).append('\'');
        sb.append(", typ='").append(typ).append('\'');
        sb.append(", baujahr=").append(baujahr);
        sb.append(", fahrBereit=").append(fahrBereit);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("EQUALS");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fahrzeug fahrzeug = (Fahrzeug) o;
        return baujahr == fahrzeug.baujahr && fahrBereit == fahrzeug.fahrBereit && Objects.equals(kennzeichen, fahrzeug.kennzeichen) && Objects.equals(marke, fahrzeug.marke) && Objects.equals(typ, fahrzeug.typ);
    }

    @Override
    public int hashCode() {
        System.out.println("HASHCODE");
        return Objects.hash(kennzeichen, marke, typ, baujahr, fahrBereit);
    }
}
