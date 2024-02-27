package de.lubowiecki.uebung1;

public class RechnerTest {

    public static void main(String[] args) {

        // Aufruf einer statischen Methode
        System.out.println(Rechner.add(10, 15));

        InstanzRechner r1 = new InstanzRechner();
        InstanzRechner r2 = r1;

        // Aufruf einer Instanzmethode - braucht immer eine Instanz/Objekt
        System.out.println(r1.add(10,27));

        r1 = null;

        // Verwendung einer Klasse aus der Standard-Bibliothek von Java
        String s1 = new String("Hi");
        String s2 = "Hi";
    }
}
