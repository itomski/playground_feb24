package de.lubowiecki.playground.api;

public class EquelsTest {

    public static void main(String[] args) {

        Object a = new Object();
        Object b = new Object();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        // Bei Object macht equals auch einen Referenzvergleich
        System.out.println(a.equals(b)); // Inhaltsvergleich

        System.out.println(a == b); // Referenzvergleich

        System.out.println();

        // Eigene Klassen haben erst einmal das gleiche Verhalten wie Object
        Mensch m1 = new Mensch("Peter", "Parker");
        Mensch m2 = new Mensch("Peter", "Parker");
        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());

        // Der Entwickler muss Java sagen, wie der Inhalt verglichen werden kann
        // das passiert durch das Überschrieben der equals-Methode
        System.out.println(m1.equals(m2));

        System.out.println(m1.equals(null));

        System.out.println(m1 == m2);


    }
}
