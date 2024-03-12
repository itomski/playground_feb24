package de.lubowiecki.playground.time;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class LocalDateTest {

    public static void main(String[] args) {

        LocalDate ld1 = LocalDate.now();
        System.out.println(ld1);

        LocalDate ld2 = LocalDate.of(2000, 5, 25);
        System.out.println(ld2);

        // Veraltet
        // Date date = new Date(2000, 4, 25);
        // System.out.println(date);

        Scanner scanner = new Scanner(System.in);

        // Eingabe vom ganzen Datum
        System.out.print("Gib ein Datum ein (JJJJ-MM-TT): ");
        String datumsString = scanner.nextLine();
        LocalDate datum1 = LocalDate.parse(datumsString); // Wandelt eine Zeichenkette in ein LocalDate um
        System.out.println(datum1);

        System.out.println();

        // Eingabe einzelner Werte
        System.out.print("Jahr: ");
        int jahr = Integer.parseInt(scanner.nextLine()); // parseInt wandelt Zeichenketten in Zahlen um
        System.out.print("Monat: ");
        int monat = Integer.parseInt(scanner.nextLine());
        System.out.print("Tag: ");
        int tag = Integer.parseInt(scanner.nextLine());
        LocalDate datum2 = LocalDate.of(jahr, monat, tag);
        System.out.println(datum2);
    }

}
