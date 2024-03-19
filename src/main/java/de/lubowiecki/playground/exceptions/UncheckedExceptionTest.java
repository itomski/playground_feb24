package de.lubowiecki.playground.exceptions;

import java.io.Console;
import java.util.Scanner;

public class UncheckedExceptionTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib eine Zahl ein: ");
        String in = scanner.nextLine();

        // Alle Exceptions, die nicht direkt oder indirekt von RuntimeException abgeleitet sind
        // sind checked Exceptions
        // Alle RuntimeException sind unchecked

        try {
            int zahl = Integer.parseInt(in); // Exception bricht die Abarbeitung des Blocks ab
            System.out.println(zahl);
        }
        catch(NumberFormatException e) {
            System.out.println("Falsches Format!");
        }

        // Funktioniert nicht in den IDEs
        // Console cli = System.console();
        // String in = cli.readLine("Eingabe: ");

        System.out.println("Ende des Programms");
    }
}
