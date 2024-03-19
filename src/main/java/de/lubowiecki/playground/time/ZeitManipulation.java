package de.lubowiecki.playground.time;

import java.time.LocalDate;
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

    }
}
