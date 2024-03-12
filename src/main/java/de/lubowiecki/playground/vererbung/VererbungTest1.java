package de.lubowiecki.playground.vererbung;

public class VererbungTest1 {

    public static void main(String[] args) {

        Box b1 = new Box();
        b1.machWas(); // Nur machWas ist verfügbar

        System.out.println();

        NextBox b2 = new NextBox();
        b2.machWas(); // AUch die Methode aus der Elternklasse ist hier verfügbar
        b2.machWasAnderes();

        System.out.println();

        AndereBox b3 = new AndereBox();
        b3.machWas();
        b3.machWasAnderes();

        System.out.println();

        doSomething(b1);
        doSomething(b2); // NextBox steht in einer IS-A-Beziehung zu Box
        doSomething(b3); // AndereBox steht in einer IS-A-Beziehung zu Box


        Object o = "Hallo"; // String IS-A Object
        o.hashCode(); // Instanzmethoden werden auf dem Objekttyp ausgeführt. Hier auf String

        Box b = new NextBox(); // NetBox IS-A Box

    }

    // Überall wo eine Klasse verlangt wird, können auch Objekte ihrer Kindklasse übergeben werden
    public static void doSomething(Box b) {
        // Instanz-Methoden werden immer auf dem Objekttyp ausgeführt
        // Der Referenztyp entscheidet, was sichtbar ist
        b.machWas();
        // b.machWasAnderes(); // Ist in Box nicht deklariert
    }
}

class Box { // Elternklasse (Parent)

    // Alle nicht privaten Eigenschaften werden an Kindklassen vererbt
    int zahl = 100;

    // Alle Methoden, die nicht privat sind werden vererbt
    void machWas() {
        System.out.println("Box..." + zahl);
    }
}

class NextBox extends Box { // NextBox erbt von Box. Kindklasse (Child)

    int andereZahl = 200;

    void machWasAnderes() {
        System.out.println("NextBox..." + (zahl + andereZahl));
    }
}

class AndereBox extends Box { // Kindklasse (Child)

    int andereZahl = 800;
    int zahl = 300; // Geerbte Eigenschaft wird überlagert

    void machWasAnderes() {
        System.out.println("NextBox..." + (zahl + andereZahl));
        // super bietet einen Zugriff auf eigenschaften der Elternklasse, auch wenn diese überlagert sind
        System.out.println("NextBox..." + (super.zahl + andereZahl));
    }

    @Override
    void machWas() {
        System.out.println("Box..." + zahl); // Nutzt zahl aus dieser Klasse
    }
}
