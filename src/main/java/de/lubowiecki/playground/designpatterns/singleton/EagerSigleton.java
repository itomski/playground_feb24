package de.lubowiecki.playground.designpatterns.singleton;

public class EagerSigleton {

    private static final EagerSigleton instance = new EagerSigleton();

    private int zahl;

    private EagerSigleton() {
    }

    public static EagerSigleton getInstance() {
        return instance;
    }

    public int getZahl() {
        return zahl;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }
}
