package de.lubowiecki.playground.api;

import java.time.LocalDate;
import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        int[] arr; // Deklaration
        arr = new int[10]; // Instanzierung und Initialisierung
        arr = new int[3]; // Neuzuweisung

        System.out.println(arr); // toString
        System.out.println(Arrays.toString(arr)); // Arrays Utility

        System.out.println(arr.length);
        System.out.println(arr.hashCode());

        System.out.println();

        // HashCode
        Object a = new Object();
        Object b = new Object();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        System.out.println();

        String s1 = "Hallo";
        String s2 = new String("Hallo");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println();
        LocalDate d1 = LocalDate.of(2024, 3, 11);
        LocalDate d2 = LocalDate.of(2024, 3, 11);
        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());

        System.out.println();

        Mensch m1 = new Mensch("Peter", "Parker ");
        Mensch m2 = new Mensch("Peter", "Parker ");
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());

    }
}
