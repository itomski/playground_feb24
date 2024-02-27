package de.lubowiecki.playground;

import de.lubowiecki.uebung1.Rechner;

public class App {

    public static void main(String[] args) {

        Person p1 = new Person(); // Verwendung des default Konstruktors
        Person p2 = new Person();
        Person p3 = new Person();

        // System.out.println(p1.firstname); // Error: Eigenschaft ist privat
        System.out.println(p1.lastname); // Ok: Eigenschaft ist public
        p1.lastname = "Parker"; // Schreiben
        System.out.println(p1.lastname);
        p1.age = 32;
        p1.age = -32; // alle ints sind erlaubt
        System.out.println(p1.age);
        // System.out.println(p1.smoker); // Error: Eigenschaft ist privat

        System.out.println();
        p2.lastname = "Banner";
        p2.age = 43;
        System.out.println(p2.lastname);
        System.out.println(p2.age);

        System.out.println();
        p3.lastname = "Danvers";
        p3.age = 25;
        System.out.println(p3.lastname);
        System.out.println(p3.age);

        System.out.println();

        BetterPerson p4 = new BetterPerson("Peter", "Parker", 22, false);
        /*
        p4.setFirstname("Peter");
        p4.setLastname("Parker");
        p4.setAge(22); // hat keine Auswirkungen
        p4.setSmoker(true);
        */

        System.out.println(p4.getFirstname() + " " + p4.getLastname());
        System.out.println(p4.getAge());

        System.out.println();

        BetterPerson p5 = new BetterPerson("Carol", "Danvers");
        p5.setSmoker(true);
        System.out.println(p5.getFirstname() + " " + p5.getLastname());
        System.out.println(p5.getAge());

        System.out.println();
        p4.sayHello();

        System.out.println();
        p5.sayHello();

        Rechner.add(15, 22);
        // Wert ist weg
        double erg = Rechner.add(15, 22); // Der Rückgabewert der add-Methode wird in der Variable erg aufgefangen

        var erg2 = Rechner.add(15, 22); // Ab Java 1.9
        //erg2 = false; // erg2 ist vom typ double

        System.out.println(erg);

        // Sind bis zum Ende der Methode verfügbar
        int i = 100;

        { // Scope
            System.out.println(i);
            int j = 500; // Nur bis zum ende des Blocks verfügbar
            System.out.println(j);
        } // j wird am ende

        System.out.println(i);
        // System.out.println(j); // Hier nicht mehr verfügbar
    }

}
