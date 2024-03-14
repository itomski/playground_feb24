package de.lubowiecki.playground.vererbung;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface UI {

    // alle Eigenschaften sind automatisch public static final
    String HELP = "Das ist der Text für Hilfe...";
    DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    DateTimeFormatter TIME_FMT = DateTimeFormatter.ofPattern("HH:mm");

    // Statische Methoden aus einem Interface werden nicht vererbt
    // Sie müssen über das Interface ausgeführt werden
    static void printFormatedDate(LocalDate date) { // automatisch public
        System.out.println(date.format(DATE_FMT));
    }
}
