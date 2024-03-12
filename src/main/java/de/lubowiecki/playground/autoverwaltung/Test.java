package de.lubowiecki.playground.autoverwaltung;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Auto> autoListe = new ArrayList<>();

        while(true) {
            Auto auto = new Auto();

            System.out.print("Kennzeichen: ");
            String kennzeichen = scanner.nextLine();
            auto.setKennzeichen(kennzeichen);

            System.out.print("Marke: ");
            String marke = scanner.nextLine();
            auto.setMarke(marke);

            autoListe.add(auto);

            System.out.println();

            for (Auto a : autoListe) {
                System.out.println(a.getKennzeichen() + ", " + a.getMarke());
            }

            System.out.println();
        }
    }
}
