package de.lubowiecki.playground;

import java.time.*; // Importiert alle Klasse aus dem Package
import java.time.format.*; // * Importiert keine Subpackages
/*
import java.time.LocalDate; // Muss vor der Verwendung importiert werden
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
*/
import java.util.Date;
import java.util.Locale;

public class ImportTest {

    public static void main(String[] args) {

        // Alle Klasse aus dem Package java.lang sind automatisch verfügbar
        // Müssen nicht importiert werden
        String str = "Hi";

        // Ab Java 1.8 oder einfach Java 8
        LocalDate heute = LocalDate.now();

        // fullyquallified Verwendung - Import nicht nötig
        java.time.LocalTime jetzt = java.time.LocalTime.now();

        // Vor Java 8
        Date date1 = new Date(2024, 2, 28);
        System.out.println(date1);
        java.sql.Date date2 = java.sql.Date.valueOf(heute);
        System.out.println(date2);

        Locale.setDefault(Locale.US);

        //final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");
        final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(heute.format(DATE_FMT));


    }
}
