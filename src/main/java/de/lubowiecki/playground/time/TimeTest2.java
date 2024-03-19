package de.lubowiecki.playground.time;

import java.time.*;
import java.util.Date;

public class TimeTest2 {

    public static void main(String[] args) {

        // Standardformat ist ISO (yyyy-MM-ddTHH:mm:ss)

        long start = System.currentTimeMillis();

        // LocalDate, LocalTime, LocalDateTime ersetzen java.util.Date
        LocalDate d1;
        d1 = LocalDate.now();
        System.out.println(d1); // now ist eine Fabrikmethode
        d1 = LocalDate.of(2015, Month.AUGUST, 17);
        //d1 = LocalDate.of(2015, 8, 17);
        System.out.println(d1);

        System.out.println();

        LocalTime t1;
        t1 = LocalTime.now();
        System.out.println(t1);
        t1 = LocalTime.of(23, 22);
        System.out.println(t1);

        System.out.println();

        LocalDateTime dt1;
        dt1 = LocalDateTime.now();
        System.out.println(dt1);
        dt1 = LocalDateTime.of(2020, 6, 18, 22, 15, 10);
        System.out.println(dt1);
        dt1 = LocalDateTime.of(2020, 6, 18, 22, 15);
        System.out.println(dt1);
        dt1 = LocalDateTime.of(d1, t1);
        System.out.println(dt1);

        System.out.println();

        Period p; // Abstand zwischen zwei Datumsangaben
        Duration d; // Abstand zwischen zwei Zeitangaben

        Instant i; // Maschinenzeit in Nano-Sekunden
        System.out.println(Instant.now());

        System.out.println();

        Date d2 = new Date();
        System.out.println(d2);
        d2 = new Date(2020, 5, 17);
        System.out.println(d2);

        // Der einzige Setter von Date, der nicht depricated ist
        d2.setTime(System.currentTimeMillis());
        System.out.println(d2);

        long end = System.currentTimeMillis();

        System.out.println(end - start + "ms");
    }
}
