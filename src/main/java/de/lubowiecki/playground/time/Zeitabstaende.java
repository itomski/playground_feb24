package de.lubowiecki.playground.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Zeitabstaende {

    public static void main(String[] args) {

        LocalDate heute = LocalDate.now();
        LocalDate wm = LocalDate.of(2024, 6, 14);

        // Abstand zwischen zwei Datumsangaben
        Period p = Period.between(heute, wm);
        System.out.println(p);
        System.out.println(p.getYears() + " Jahre");
        System.out.println(p.getMonths() + " Monate");
        System.out.println(p.getDays() + " Tage");


        LocalTime jetzt = LocalTime.now();
        LocalTime spaeter = LocalTime.of(16, 30);

        // Abstand zwischen zwei Zeitangaben
        Duration d = Duration.between(jetzt, spaeter);
        System.out.println(d);

        // Umrechnung
        System.out.println(d.toHours());
        System.out.println(d.toMinutes());
        System.out.println(d.toSeconds());

        // Ausgabe
        /*
        System.out.println(d.get(ChronoUnit.HOURS) + " Stunden");
        System.out.println(d.get(ChronoUnit.MINUTES) + " Minuten");
        System.out.println(d.get(ChronoUnit.SECONDS) + " Sekunden");
        */

        Period p2 = Period.ofMonths(3);
        System.out.println(LocalDate.now().plus(p2));

    }
}
