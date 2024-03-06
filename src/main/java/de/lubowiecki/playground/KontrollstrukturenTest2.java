package de.lubowiecki.playground;

import java.util.Scanner;

public class KontrollstrukturenTest2 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Eingabe: ");
        // trim entfernt Leerzeichen und Tabs an beiden Enden
        // toLowerCase ändert alles auf Kleinbuchstaben
        String input = scanner.next().trim().toLowerCase();

        /*
        if(input.equals("help")) {
            System.out.println("Hier kommt die Hilfe");
        }
        else if(input.equals("exit")) {
            System.out.println("Programm wird verlassen");
        }
        else if(input.equals("run")) {
            System.out.println("Programm wird ausgeführt");
        }
        else {
            System.out.println("Falsche Eingabe");
        }
        */

        switch(input) {
            case "help":
                System.out.println("Hier kommt die Hilfe");
                break;

            case "exit":
                System.out.println("Programm wird verlassen");
                break;

            case "run":
            System.out.println("Programm wird ausgeführt");
                break;

            default: // Wenn kein passender Case gefunden wurde
                System.out.println("Falsche Eingabe");
        }

        System.out.println();

        Wochentag auswahl = Wochentag.MI;

        System.out.println("Diese Woche hat noch folgende Tage:");

        switch(auswahl) {
            case MO:
                System.out.println("Montag");

            case DI:
                System.out.println("Dienstag");

            case MI:
                System.out.println("Mittwoch");

            case DO:
                System.out.println("Donnerstag");

            case FR:
                System.out.println("Freitag");

            case SA:
                System.out.println("Samstag");

            case SO:
                System.out.println("Sonntag");

            /*case GT: // Kompilererror. GT ist kein gültiger Wert für das Enum Wochentag
                System.out.println("Sonntag");*/
        }


        // switch arbeit mit
        // Strings
        // Enums
        // Ganzzahlen ohne long
        // chars

        System.out.println();

        byte wert = 20;

        switch(wert) {
            case 10:
                System.out.println("Gut");
                break;

            case 20:
            System.out.println("Sehr gut");
                break;

            case 50:
            System.out.println("Super");
                break;

            case 100:
            System.out.println("Genial");
                break;

            /*
            case 150: // Wert ist zu groß für den Datentyp aus dem switch-Parameter
                System.out.println("Gigantisch!");
                break;
             */
        }


    }
}
