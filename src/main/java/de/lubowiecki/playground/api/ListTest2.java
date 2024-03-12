package de.lubowiecki.playground.api;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {

    public static void main(String[] args) {

        /*
        List<Integer> zahlen = new ArrayList<>();
        zahlen.add(15);
        zahlen.add(1);
        zahlen.add(17);
        zahlen.add(22);
        zahlen.add(-18);
        zahlen.add(3);
        // Ordnung != Sortierung
        // Ordnung: Einfügereihenfolge
        System.out.println(zahlen);
        */

        List<Fahrzeug> fahrzeuge = new ArrayList<>();
        fahrzeuge.add(new Fahrzeug("HH:AB123", "Ford", "Mustang", 1972));
        fahrzeuge.add(new Fahrzeug("AB:CD789", "Fiat", "500", 2002, true));
        fahrzeuge.add(new Fahrzeug("CD:EG177", "Renault", "Zoe", 2020));
        fahrzeuge.add(new Fahrzeug("XY:Z1000", "Audi", "A4", 2021, true));

        for (Fahrzeug f: fahrzeuge) {
            System.out.println(f);
        }

        System.out.println();

        List<Fahrzeug> neueListe = new ArrayList<>(fahrzeuge);

        for (Fahrzeug f: neueListe) {
            System.out.println(f);
        }

        System.out.println("--- ÄNDERUNG ---");

        Fahrzeug zoe = neueListe.get(2);
        zoe.setBaujahr(2022);
        zoe.setFahrBereit(true);

        for (Fahrzeug f: fahrzeuge) {
            System.out.println(f);
        }

        System.out.println();

        for (Fahrzeug f: neueListe) {
            System.out.println(f);
        }

    }
}
