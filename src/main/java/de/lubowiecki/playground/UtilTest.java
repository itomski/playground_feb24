package de.lubowiecki.playground;

import java.util.Collections;
import java.util.Objects;

public class UtilTest {

    public static void main(String[] args) {

        // Arrays
        // Collections
        // Objects
        // Objects o = new Objects(); // Geht nicht, da der Konstruktor privat ist
        System.out.println(Objects.hash(10, 15, 22)); // Verwendung erfolgt immer über die Klasse

        //MyUtil a = new MyUtil();
        //a.doSomething(); // Java ruft diese Methode auf der Klasse auf, weil sie statisch ist
        MyUtil.doSomething(); // in dieser Form

    }
}

class MyUtil {
    // Wenn kein eigener Konstruktor deklariert ist
    // Java baut automatisch einen parameterlosen default-Konstruktor

    private MyUtil() {
    }

    static void doSomething() {
        System.out.println("Bla bla bla...");
    }
}
