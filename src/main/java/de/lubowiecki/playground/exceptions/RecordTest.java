package de.lubowiecki.playground.exceptions;

import java.time.LocalDate;

public class RecordTest {

    public static void main(String[] args) {

        Info info = new Info("Das ist mein Text", LocalDate.now());

        System.out.println(info.getContent());
        System.out.println(info.getCreatedAt());
        System.out.println(info);

        InfoRecord rec = new InfoRecord("Das ist mein Text", LocalDate.now());
        System.out.println(rec.content());
        System.out.println(rec.createdAt());
        System.out.println(rec);
    }


}
