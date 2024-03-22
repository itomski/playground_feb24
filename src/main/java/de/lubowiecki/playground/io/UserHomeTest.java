package de.lubowiecki.playground.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class UserHomeTest {

    public static void main(String[] args) {

        System.out.println(System.getProperties());
        System.out.println(System.getProperty("user.home"));
        String fileName = System.getProperty("user.home") + "/file.txt";
        System.out.println(fileName);

        try (Writer out = Files.newBufferedWriter(Paths.get(fileName))) {
            out.append("Das ist das Haus von Nikigraus");
        }
        catch (IOException e) {
            System.out.println("Probleme beim Schreiben");
        }
    }
}
