package de.lubowiecki.playground.vererbung;

public class PolyTest {

    public static void main(String[] args) {

        // Referenztyp: Charakter
        // Objekttyp: Schweizer
        Charakter charakter = new Schweizer();
        sagWas(charakter);
    }

    public static void sagWas(Charakter ch) {
        // Instanzmethoden werden IMMER auf dem Objektyp ausgeführt
        // Der Referenztyp sagt, welche Methoden sichtbar sind
        // Ausgeführt werden diese Methoden aber auf dem Objekttyp
        ch.hi();
        //ch.hiAufHochdeutch();

        // Statische Methoden und Eigenschaften werden IMMMMMMMMMMMMER auf dem Referenztyp ausgeführt
    }
}

class Charakter {

    void hi() {
        System.out.println("Hallo");
    }
}

class Hamburger extends Charakter {

    @Override
    void hi() {
        System.out.println("Moin Moin");
    }
}

class Bayer extends Charakter {

    @Override
    void hi() {
        System.out.println("Grüß Gott");
    }
}

class Schweizer extends Charakter {

    @Override
    void hi() {
        System.out.println("Grüzi");
    }

    void hiAufHochdeutsch() {
        System.out.println("... ich glaubt... Hallo...");
    }
}
