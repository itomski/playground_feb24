package de.lubowiecki.playground.io;

import com.fasterxml.jackson.databind.type.CollectionType;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GsonJson {

    private final String FILE_NAME = "data.json";
    private final Scanner scanner = new Scanner(System.in);

    private final Gson gson;

    public GsonJson() {
        this.gson = new GsonBuilder()
                        .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
                        .create();
    }

    public static void main(String[] args) {
        new GsonJson().start();
    }

    private void start() {

        /*
        try {
            List<Person> personen = load(FILE_NAME);
            System.out.println(personen);
        }
        catch (IOException e) {
            System.out.println("Daten konnten nicht geladen werden.");
        }
        */

        List<Person> personen = new ArrayList<>();

        Person p = new Person();

        System.out.print("Vorname: ");
        p.setVorname(scanner.nextLine());

        System.out.print("Nachname: ");
        p.setNachname(scanner.nextLine());

        System.out.print("Geburtsdatum: ");
        p.setGeburtsDatum(LocalDate.parse(scanner.nextLine())); // ISO

        personen.add(p);

        try {
            save(personen, FILE_NAME);
            System.out.println("Erfolgreich gespeichert");
        }
        catch (IOException e) {
            System.out.println("Konnte nicht gespeichert werden");
        }

    }

    private void save(List<Person> personen, String fileName) throws IOException {
        try(Writer writer = Files.newBufferedWriter(Paths.get(fileName))) {
            gson.toJson(personen, writer);
        }
    }

    private List<Person> load(String fileName) throws IOException {

        List<Person> personen = new ArrayList<>();

        try(Reader reader = Files.newBufferedReader(Paths.get(fileName))) {
            personen = gson.fromJson(reader, new TypeToken<List<Person>>(){}.getType());
        }

        return personen;
    }
}
