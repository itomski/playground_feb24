package de.lubowiecki.playground;

public class KontrollstrukturTest {

    public static void main(String[] args) {

        int i = 10;

        if(i < 100) {

        }

        boolean exit = false;

        if(exit = true) { // Zuweisung
        }

        //if(true = exit) { // Kompilererror
        //}

        if(i < 100) {
            System.out.println("OK");
        }
        else {
            System.out.println("Nicht OK");
        }

        System.out.println();

        i = 10;

        if(i < 100) {
            System.out.println("OK");
        }
        else if (i < 1000) {
            System.out.println("Auch OK");
        }
        else if (i < 2000) {
            System.out.println("Top");
        }
        else {
            System.out.println("Nicht OK");
        }

        String output;

        if(i < 100) {
            output = "123";
        }
        else {
            output = "456";
        }

        System.out.println(output);

        output = (i < 100) ? "123" : "456";

        String gender = "h";

        System.out.println("Hallo " + ((gender.equals("f")) ? "Frau" : "Herr") + " Petersen");
    }
}
