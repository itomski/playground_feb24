package de.lubowiecki.playground.designpatterns.singleton;

public class LazySingleton {

    private static LazySingleton instance;

    private int zahl;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {

        if(instance == null) {
            synchronized(LazySingleton.class) { // Thread-Safety
                if(instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    public int getZahl() {
        return zahl;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }
}