package de.lubowiecki.playground.vererbung;

public class KonstruktorTest {

    public static void main(String[] args) {

        B b = new B();
    }
}

class A {

    private int zahl;

    public A(int zahl) {
        this.zahl = zahl;
    }

    public A() {
        // super();
        System.out.println("A");
    }
}

class B extends A {

    // So sieht der Default-Konstruktor aus
    public B() {
        //super(); // wird automatisch benutzt
        System.out.println("B");
    }
}
