package de.lubowiecki.playground;

import java.util.Scanner;

public class Eingaben {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scannt die Eingabe

        System.out.print("Eingabe: ");
        String eingabe = scanner.next(); // liest Eingabe bis zum Leerzeichen
        System.out.println("Output: " + eingabe);

        System.out.print("Eingabe: ");
        eingabe = scanner.next();
        System.out.println("Output: " + eingabe);

        System.out.print("Eingabe: ");
        eingabe = scanner.next();
        System.out.println("Output: " + eingabe);


    }

}
