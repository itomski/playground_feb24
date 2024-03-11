package de.lubowiecki.playground;

import java.util.ArrayList;
import java.util.List;

public class WrapperTest {

    public static void main(String[] args) {

        // byte, short, int, long, float, double
        //        char,
        // boolean

        int i = 10;
        Integer j = i; // Autoboxing: Ein Integer-Objekt legt sich um den primitiven Wert

        // Generische Typen müssen Objekttypen sein
        // List<int> zahlen = new ArrayList<>(); // Error
        List<Integer> zahlen = new ArrayList<>(); // Ok

        zahlen.add(10); // primitive 10 wird automatisch zum Integer-Objekt
        // Wrapper-Typen haben verschiedene statische Methoden zum ARbeiten mit dem Typ
        int z = Integer.parseInt("100"); // Wandelt einen String in eine Zahl um

        // Byte, Short, Integer, Long, Float, Double
        // Character
        // Boolean

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.BYTES);
        System.out.println(Byte.SIZE);

        System.out.println(Integer.toHexString(17));
        System.out.println(Double.toHexString(20.0));

        double d = 100; // primitive widening von int zu double
        // Double dd1 = 100; // 100 ist ein int, Autoboxing erfolgt nur zum Integer. Widening zu Double nicht möglich
        Double dd2 = 100.2; // Autoboxing von double zu Double - Immer nur zum gleichen Wrapper

    }
}
