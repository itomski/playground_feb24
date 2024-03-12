package de.lubowiecki.playground;

public class BuchstabenTest {

    public static void main(String[] args) {

        int i = 65;
        for (int j = 0; j < 300; j++) {
            char c = (char) i++;
            System.out.print(c + ", ");
        }

        for(Bezeichnung b : Bezeichnung.values()) {
            System.out.println(b);
        }

        System.out.println();

        Bezeichnung[] labels = Bezeichnung.values(); // values liefert ein Array mit allen Optionen des ENUMs
        for (int j = 0; j < 10; j++) {
            System.out.println(labels[j]);
        }
    }
}

enum Bezeichnung {
    A, B, C, D, E, F, G, H, AA, BB, CC, EE, FF, GG, HH, AAA;
}
