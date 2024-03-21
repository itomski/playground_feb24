package de.lubowiecki.playground.exceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiTest {

    public static void main(String[] args) {

        try {
            doSomething();
        }
        catch(NullPointerException e) {
            System.out.println("Kein Objekt vorhanden");
        }
        // Diese Exceptions dürfen nicht in einer Erbbeziehung zueinander stehen
        catch(ArithmeticException | NumberFormatException e) {
            System.out.println("Beim Rechnen ist ein Problem aufgetaucht");
        }
        catch(NegativeArraySizeException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Probleme it dem Array");
        }
        catch(Exception e) {
            System.out.println("Irgendein Problem");
        }
    }

    private static void doSomething() {
        // ...
        //throw new NullPointerException("...");
        //int[] arr = new int[-10];
        int i = 10;
        int sum = 10 / 0;
    }

}
