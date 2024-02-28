package de.lubowiecki.playground;

public class StaticTest {

    public static void main(String[] args) {

        ValueBox vb1 = new ValueBox();
        vb1.setValue(10);

        ValueBox vb2 = new ValueBox();
        vb2.setValue(20);

        System.out.println(vb1.getValue());
        System.out.println(vb2.getValue());

        System.out.println("-----------------");

        StaticValueBox svb1 = new StaticValueBox();
        svb1.setValue(10);

        StaticValueBox  svb2 = new StaticValueBox();
        svb2.setValue(20); // Ändert den Zustand der value-Variable für alle Objekte

        System.out.println(svb1.getValue());
        System.out.println(svb2.getValue());
        System.out.println(StaticValueBox.getV());



    }
}

class ValueBox {

    private int value; // gehört dem Objekt

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class StaticValueBox {

    private static int value; // gehört der Klasse

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static int getV() {
        return value;
    }
}
