package de.lubowiecki.playground.vererbung;

public class BeziehungsTest {

    public static void main(String[] args) {

    }
}

// IS-A Beziehung (1 zu n) (Lebensmittel zu (Apfel, Brot,...)

class Lebensmittel {
}

class Apfel extends Lebensmittel { // Apfel IS-A Lebensmittel
}

class Brot extends Lebensmittel { // Brot IS-A Lebensmittel
}

// HAS-A Beziehung

class Auto {

    // Ein Auto hat einen Motor (1 zu 0..1)
    private Motor motor;

    // Auto hat 2 Türen (1 zu n)
    private Tür[] türen = new Tür[2];

}

class Motor {

}

class Tür {

}

class Reifen {

}