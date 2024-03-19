package de.lubowiecki.playground.time;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class ZeitManipulation {

    public static void main(String[] args) {

        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        // LocalDate, LocalTime und LocalDateTime sind Immutable
        ld = ld.plusDays(100);
        ld = ld.plusYears(10);
        ld = ld.plusMonths(2);
        ld = ld.plusWeeks(2);
        ld = ld.minusDays(200);
        ld = ld.plus(100, ChronoUnit.DAYS);
        //ld = ld.plus(100, ChronoUnit.MINUTES);
        ld = ld.minus(5, ChronoUnit.YEARS);
        System.out.println(ld);

        System.out.println();

        // Teile Verbinden
        Year j = Year.of(2015);
        YearMonth jm = j.atMonth(10);
        // YearMonth m = j.atMonth(Month.OCTOBER);
        LocalDate ld3 = jm.atDay(10);
        System.out.println(ld3);

        System.out.println();

        ld3 = ld3.withYear(2020); // Nur das Jahr wird angepasst
        System.out.println(ld3);

        System.out.println();


        System.out.println(LocalDate.MIN);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);

        System.out.println();


        LocalDate ld2 = LocalDate.now();
        LocalTime lt2 = LocalTime.of(15, 0);
        LocalDateTime ldt2 = ld2.atTime(lt2); // Verbindet Datum mit Zeit
        ldt2 = lt2.atDate(ld2); // Verbindet Zeit mit Datum

        System.out.println(ld2.getYear());
        System.out.println(ld2.getMonth());
        System.out.println(ld2.getDayOfMonth());
        System.out.println(ld2.getDayOfWeek());
        System.out.println(ld2.getDayOfYear());
        System.out.println(ld2.get(ChronoField.YEAR));

        // ChronoUnit.MILLIS // Einheiten
        // ChronoField.MINUTE_OF_DAY // Bestimmet Information einer Zeit/Datums-Angabe

    }
}
