package de.lubowiecki.playground.uebung5;

import java.util.ArrayList;
import java.util.List;

public class ProduktTest {

    public static void main(String[] args) {

        List<Produkt> produkte = new ArrayList<>();

        char auswahl = 'n'; // 'v';

        Produkt p;

        if(auswahl == 'v') {
            VerderblichesProdukt vp = new VerderblichesProdukt();
            // Ablaufdatum befüllen
            p = vp;
        }
        else {
            p = new Produkt();
        }
        // befüllen

        produkte.add(p);
    }
}

class Produkt {

}

class VerderblichesProdukt extends Produkt {

}
