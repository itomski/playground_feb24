package de.lubowiecki.playground.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ThrowTest1 {

    public static void main(String[] args) /* throws Exception */ {

        // Alle Checked-Exceptions müssen behandelt oder weiter geworfen werden
        // Alle Unchecked-Exceptions können, müssen aber nicht behandelt werden
        try {
            doSomething();
        }
        /*
        catch (Exception e) { // HIer würden alle Exceptions eingesammelt werden

        } */
        catch (FileNotFoundException e) {
            System.out.println("Datei nicht gefunden.");
            System.out.println("Nachricht: " + e.getMessage());
        }
        catch (SQLException e) {
            System.out.println("Datenbank nicht erreichbar.");
            System.out.println("Nachricht: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Anderes Problem.");
            System.out.println("Nachricht: " + e.getMessage());
        }
    }

    // throw = Exception wird geworfen
    // throws = Bei der Verwendung dieser Methode KÖNNTE eine Exception entstehen
    private static void doSomething() throws FileNotFoundException, SQLException, NullPointerException {
        // ...
        //throw new FileNotFoundException("Datei nicht da!");
        //throw new SQLException("Datenbank nicht da!");
        //throw new NullPointerException("...");
    }


}
