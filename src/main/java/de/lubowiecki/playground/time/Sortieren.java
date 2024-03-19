package de.lubowiecki.playground.time;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sortieren {

    // Alle Timeklassen sind sortierbar d.h. sie implementieren Comparable

    public static void main(String[] args) {

        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.now());
        dates.add(LocalDate.of(2015, 3, 17));
        dates.add(LocalDate.of(2026, 4, 20));
        dates.add(LocalDate.of(1999, 7, 1));
        dates.add(LocalDate.of(1985, 12, 31));

        System.out.println(dates);
        Collections.sort(dates); // Sortiert nach natürlicher Ordnung

        System.out.println(dates);

        // Vergleichsobjekt
        Comparator<LocalDate> comp = (d1, d2) -> d1.compareTo(d2);
        Collections.sort(dates, comp.reversed());
        System.out.println(dates);

        System.out.println();

        LocalDate ld2 = LocalDate.of(2024, 1, 31);
        System.out.println(ld2);

        // Ist der Monat kürzer, bleibt das Datum beim letzten des Monats hängen
        System.out.println(ld2.plusMonths(1));

        // Hier werden 30 Tage gem. Kalender weitergerechnet
        System.out.println(ld2.plusDays(30));
    }
}
