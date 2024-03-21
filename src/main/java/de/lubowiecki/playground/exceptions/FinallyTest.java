package de.lubowiecki.playground.exceptions;

public class FinallyTest {

    public static void main(String[] args) {

        try {
            System.out.println("Ich versuche es.");
            //String s = null;
            String s = "";
            s = s.toLowerCase(); // NullPointerException
            System.out.println("Ich habe es versucht.");
        }
        catch (NullPointerException e) {
            System.out.println("Kein Objekt vorhanden.");
        }
        finally {
            System.out.println("Das Ende aller Dinge.");
        }

        // Mögliche Kombinationen
        // try-catch
        // try-catch-finally
        // try-finally

        // nicht erlaubt
        // try (außer bei try-with-ressources)
        // catch-finally

        System.out.println();

        doSomething(15);

        System.out.println();

        System.out.println(doSomethingElse(100));

    }

    private static void doSomething(int i) {

        try {
            System.out.println("Start.");

            if (i < 10) {
                throw new RuntimeException("Die Zahl ist zu klein.");
            }
            else {
                System.out.println("Die Zahl ist ok.");
            }

            return; // verlässt die Methode
        }
        catch(RuntimeException e) {
            System.out.println("Problem mit der Zahl");

            return; // verlässt die Methode
        }
        finally {
            // Wirt trotz return noch ausgeführt
            System.out.println("Ende.");
        }
    }

    private static int doSomethingElse(int i) {

        try {
            System.out.println("Start.");
            return 10;
        }
        finally {
            // Wirt trotz return noch ausgeführt
            System.out.println("Ende.");
            return 10_000; // Im finally kann man den return der Methode überschreiben
        }
    }

}
