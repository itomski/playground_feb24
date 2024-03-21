package de.lubowiecki.playground.io;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JacksonJson {

    private final String FILE_NAME = "data.json";
    private final Scanner scanner = new Scanner(System.in);

    private  final ObjectMapper mapper;

    public JacksonJson() {
        mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule()); // Nur bei verwendug der Java 8 Time-Typen nötig
    }

    public static void main(String[] args) {
        new JacksonJson().start();
    }

    private void start() {

        List<Person> personen = new ArrayList<>();

        try {
            personen = load(FILE_NAME);
            System.out.println("Daten wurden geladen.");
            System.out.println(personen);
        }
        catch (IOException e) {
            System.out.println("Daten konnten nicht geladen werden.");
        }


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
            System.out.println("Daten wurden gespeichert.");
        }
        catch (IOException e) {
            System.out.println("Probleme beim Speichern.");
        }
    }

    private void save(List<Person> personen, String fileName) throws IOException {
        mapper.writeValue(new FileWriter(fileName), personen);
    }

    private List<Person> load(String fileName) throws IOException {
        //throw new UnsupportedOperationException("Noch nicht eingebaut");

        // Typ für das Parsen der Json-Daten vorbereiten. Hier eine List von Personen
        CollectionType type = mapper.getTypeFactory().constructCollectionType(List.class, Person.class);
        List<Person> personen = mapper.readValue(new FileReader(fileName), type);
        return personen;
    }
}
