package de.lubowiecki.playground.io;

import java.io.Serializable;

public class Adresse implements Serializable {

    private final String strasse;
    private final String nr;
    private final String plz;
    private final String stadt;

    public Adresse(String strasse, String nr, String plz, String stadt) {
        this.strasse = strasse;
        this.nr = nr;
        this.plz = plz;
        this.stadt = stadt;
    }

    public String getStrasse() {
        return strasse;
    }

    public String getNr() {
        return nr;
    }

    public String getPlz() {
        return plz;
    }

    public String getStadt() {
        return stadt;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Adresse{");
        sb.append("strasse='").append(strasse).append('\'');
        sb.append(", nr='").append(nr).append('\'');
        sb.append(", plz='").append(plz).append('\'');
        sb.append(", stadt='").append(stadt).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
