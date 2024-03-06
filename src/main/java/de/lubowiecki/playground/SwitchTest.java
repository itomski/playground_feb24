package de.lubowiecki.playground;

public class SwitchTest {

    public static void main(String[] args) {

        String input = "Peter";

        // im switch dürfen nur Kompiletime-Konstanten als cases verwendet werden
        final String n1 = "Steve"; // Kompiletime Konstanten bekommen bei der Deklaration ihren Wert
        final String n2 = "Carol";
        final String n3 = "Bruce";
        final String n4 = "Peter";

        switch(input) {
            case n1:
                System.out.println("Cap. America");
                break;

            case n2:
                System.out.println("Cap. Marvel");
                break;

            case n3: System.out.println("Hulk");
                break;

            case n4: System.out.println("Spiderman");
                break;

            default:
                System.out.println("Unbekannt");
        }

        final int i = 200;
        int eingabe = 70;

        switch(i) {
            case i - 30:
                System.out.println("Cap. America");
                break;

            case i + 20:
                System.out.println("Cap. Marvel");
                break;

            /* case i - 50 + 20: System.out.println("Hulk");
                break; */ // Error. Case hat den gleichen Wert

            case i: System.out.println("Spiderman");
                break;

            default:
                System.out.println("Unbekannt");
        }

        System.out.println();

        final String name1 = "Steve"; // Kompiletimekonstante
        System.out.println(name1);

        final String name2;
        name2 = "Steve"; // Runtimekonstante
        System.out.println(name2);
    }
}
