package de.lubowiecki.playground.time;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class FormatTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final DateTimeFormatter DATE_FMT_ = DateTimeFormatter.ISO_DATE;
        //final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("EEEE, dd. MMMM y G"); // Nach Muster
        final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("EEEE, dd. MMMM u"); // Vor unser Era wird als - Wertes angezeigt
        final DateTimeFormatter TIME_FMT = DateTimeFormatter.ofPattern("HH:mm");

        //LocalDate heute = LocalDate.now();
        LocalDate heute = LocalDate.of(-25, 10, 15);
        //LocalTime jetzt = LocalTime.now();
        LocalTime jetzt = LocalTime.of(11,3);

        System.out.println(heute.format(DATE_FMT)); // Beides möglich. Datum ist nur mit Formatierung für Datum verwendbar
        System.out.println(DATE_FMT.format(heute));
        System.out.println(jetzt.format(TIME_FMT)); // Zeit ist nur mit Formatierung für Zeit verwendbar
        System.out.println(TIME_FMT.format(jetzt));

        // Für die Prüfung relevant
        // y und u Jahre
        // M Monate
        // m Minuten
        // H Stunden
        // s Sekunden
        // d Monatstag
        // D Jahrestag

        // Für die Prüfung nicht relevant
        // E Wochentag
        // G Era

        System.out.println();

        // Wenn nicht geändert wird diese Information von Betriebssystem an JVM übergeben
        Locale.setDefault(Locale.GERMANY); // Änderung der Default Sprache oder des Landes

        // Dynamisches Format
        final DateTimeFormatter LOCAL_DATE_FMT = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG); // automatisch Landesanpassung
        System.out.println(LocalDate.now().format(LOCAL_DATE_FMT));


        DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        while(true) {
            try {
                System.out.print("Datum [TT.MM.JJJJ]: ");
                // LocalDate.parse("...") // Verwendet das ISO Format
                LocalDate ld = LocalDate.parse(scanner.nextLine(), FMT);
                System.out.println(ld); // Standard ISO
                System.out.println(ld.format(FMT));
                break;
            }
            catch(DateTimeException e) {
                System.out.println("Falsches Format");
            }
        }
    }
}
