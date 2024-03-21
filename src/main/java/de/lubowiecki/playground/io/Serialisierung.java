package de.lubowiecki.playground.io;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Serialisierung {

    public static void main(String[] args) {

        List<Person> personen = new ArrayList<>();

        // ALten Daten werden geladen.
        try {
            personen = load("data.ser");
            System.out.println("Daten erfolgreich gelesen.");
        }
        catch (Exception e) {
            System.out.println("Problem beim Lesen.");
        }

        System.out.println(personen);

        /*
        Person p1 = new Person("Peter", "Parker", LocalDate.of(2001, 5, 15));
        Adresse a1 = new Adresse("Musterweg", "15a", "23456", "Musterstedt");
        p1.setAdresse(a1);

        System.out.println(p1);

        Person p2 = new Person("Carol", "Danvers", LocalDate.of(1999, 7, 18));
        Adresse a2 = new Adresse("Musterplatz", "1", "23456", "Musterstedt");
        p2.setAdresse(a2);

        System.out.println(p2);

        List<Person> personen = new ArrayList<>();
        personen.add(p1);
        personen.add(p2);
        */

        Scanner scanner = new Scanner(System.in);

        Person p = new Person();

        System.out.print("Vorname: ");
        p.setVorname(scanner.nextLine());

        System.out.print("Nachname: ");
        p.setNachname(scanner.nextLine());

        System.out.print("Geburtsdatum: ");
        p.setGeburtsDatum(LocalDate.parse(scanner.nextLine())); // ISO

        personen.add(p);

        try {
            save(personen, "data.ser");
            System.out.println("Speichern erfolgreich.");
        }
        catch (Exception e) {
            System.out.println("Problem beim Speichern.");
        }

    }

    private static void save(List<Person> personen, String fileName) throws IOException {

        // Serialisierung = Objekte in Zeichenketten übersetzen und speichern

        /* bis Java 1.6
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
            oos.writeObject(personen);
            oos.close();
            System.out.println("Daten wurden gespeichert.");
        }
        catch(IOException e) {
            System.out.println("Problem beim Speichern.");
            System.out.println(e.getMessage());
        }
        */

        // ab Java 1.7
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(personen);
            // geöffnete Ressource wird automatisch geschlossen
        }
    }

    private static List<Person> load(String fileName) throws IOException, ClassNotFoundException {

        // Deserialisierung = Inhalt einer Datei einlesen und Zeichenkette in Objekt übersetzen

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            List<Person> personen = (List<Person>) ois.readObject();
            return personen;
        }
    }

}
