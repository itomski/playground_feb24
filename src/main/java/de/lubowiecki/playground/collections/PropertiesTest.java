package de.lubowiecki.playground.collections;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.Scanner;

public class PropertiesTest {

    private static final String FILE_NAME = "config.properties";

    public static void main(String[] args) {

        // user.home ist der Benutzerordner
        final Path CONFIG_DIR = Paths.get(System.getProperty("user.home") + "/dbconf");
        final Path CONFIG_FILE = CONFIG_DIR.resolve("conf.properties"); // Verbindet Ordner und Datei

        Scanner scanner = new Scanner(System.in);

        try {
            if (!Files.exists(CONFIG_DIR)) {
                Files.createDirectory(CONFIG_DIR); // Erzeugt den Ordner, wenn noch nicht da
            }

            if (!Files.exists(CONFIG_FILE)) {
                Files.createFile(CONFIG_FILE);
            }

            /*
            Properties prop = new Properties();
            System.out.print("Benutzer: ");
            prop.put("user", scanner.nextLine());

            System.out.print("Passwort: ");
            prop.put("password", scanner.nextLine());

            writeConfig(prop, CONFIG_FILE);
            */

            Properties prop = readConfig(CONFIG_FILE);
            System.out.println(prop);

        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }


        /*
        // Lesen
        try(InputStream in = new FileInputStream(FILE_NAME)) {

            Properties prop = new Properties();
            prop.load(in);
            //prop.loadFromXML(in); // Zum einlesen von XML-Properties

            //System.out.println(prop.getProperty("key"));
            System.out.println(prop.getProperty("db.user"));
            //System.out.println(prop.getProperty("key", 0));
            System.out.println(prop.getProperty("db.port", "8889"));

        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
        */

        /*
        // Schreiben
        try(Writer out = new FileWriter("next_config.properties")) {

            Properties prop = new Properties();
            prop.put("benutzer", "Peter");
            prop.put("email", "p.parker@shield.org");
            prop.put("format.date", "dd.MM.yyyy");

            prop.store(out, "Dies und das...");

        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
        */

        /*
        // Schreiben
        try(OutputStream out = new FileOutputStream("next_config.xml")) {

            Properties prop = new Properties();
            prop.put("benutzer", "Peter");
            prop.put("email", "p.parker@shield.org");
            prop.put("format.date", "dd.MM.yyyy");

            prop.storeToXML(out, "Dies und das...");

        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
        */
    }

    private static void writeConfig(Properties prop, Path path) throws IOException {

        try(OutputStream out = Files.newOutputStream(path)) {
            prop.store(out, null);
        }
    }

    private static Properties readConfig(Path path) throws IOException {

        try(InputStream in = Files.newInputStream(path)) {
            Properties prop = new Properties();
            prop.load(in);
            return prop;
        }
    }
}
