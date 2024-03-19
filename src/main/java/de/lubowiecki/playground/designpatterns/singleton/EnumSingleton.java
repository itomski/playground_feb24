package de.lubowiecki.playground.designpatterns.singleton;

// Eager
public enum EnumSingleton {

    INSTANCE;

    private int zahl;

    public int getZahl() {
        return zahl;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }
}
