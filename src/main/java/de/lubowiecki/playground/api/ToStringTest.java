package de.lubowiecki.playground.api;

import com.google.common.base.MoreObjects;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToStringTest {

    public static void main(String[] args) {

        // Immutable
        Mensch spiderman = new Mensch("Peter", "Parker");
        Mensch hulk = new Mensch("Bruce", "Banner");

        System.out.println(spiderman); // toString wird automatisch verwendet
        System.out.println(hulk);

        List<String> namen = new ArrayList<>();
        namen.add("Natasha");
        namen.add("Tony");
        namen.add("Carol");
        System.out.println(namen); // hier wird die toString-Methode der ArrayList verwendet

        LocalDate heute = LocalDate.now();
        System.out.println(heute); // hier wird die toString-Methode der LocalDate verwendet


    }
}


