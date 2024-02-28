package de.lubowiecki.uebung2;

import java.util.Arrays;

public class DiceApp {

    public static void main(String[] args) {

        DiceCup dc1 = new DiceCup();
        System.out.println(dc1.roll());
        System.out.println(Arrays.toString(dc1.roll(10))); // toString wird bei der Ausgabe von Objekten ausgeführt

        System.out.println();

        dc1 = new DiceCup(10); // die Referenz dc1 wird auf ein neues DieceCup-Objekt gesetzt
        System.out.println(dc1.roll());
        int[] erg = dc1.roll(10);
        System.out.println(Arrays.toString(erg));
        System.out.println(dc1.stats(erg));

        System.out.println();

        dc1 = new DiceCup(100);
        System.out.println(dc1.roll());
        System.out.println(Arrays.toString(dc1.roll(10)));


    }
}
