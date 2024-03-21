package de.lubowiecki.playground.exceptions;

import java.util.UUID;

public class AlterTest {

    public static void main(String[] args) {

        try {
            System.out.println(checkAlter(10));
        }
        catch(RuntimeException e) {
            System.out.println("Dein Alter passt nicht.");
        }
        /*
        catch(ZuJungException e) {
            System.out.println("Du musst noch bisschen älter werden");
        }
        catch(ZuAltException e) {
            System.out.println("Sorry. Zu spät!");
        }
        */
    }

    private static UUID checkAlter(int alter) {

        if(alter > 90) {
            throw new ZuAltException();
        }
        else if (alter < 12) {
            throw new ZuJungException();
        }

        return UUID.randomUUID();
    }
}

class ZuJungException extends RuntimeException {
}

class ZuAltException extends RuntimeException {
}

