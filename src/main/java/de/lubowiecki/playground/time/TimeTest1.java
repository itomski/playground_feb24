package de.lubowiecki.playground.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeTest1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.print("Datum: ");
        String input = scanner.nextLine();

        try {
            LocalDate datum = LocalDate.parse(input, fmt);
            System.out.println(datum.format(fmt));
        }
        catch(RuntimeException e) {
            System.out.println("Problem mit dem Datum.");
        }
    }
}
