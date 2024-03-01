package de.lubowiecki.playground;

public class ArrayTest {

    public static void main(String[] args) {

        int[] zahlen = new int[10]; // Muss eine Größe erhalten
        char[] zeichen = new char[100];
        String[] namen = new String[3]; // Bei allen Obejttypen wird das array mit null aufgefüllt
        Kreis[] kreise = new Kreis[5];

        String[] namen2 = {"Peter", "Natasha", "Carol", "Tony"}; // Die Anzahl der Werte ist die Größe

        // Arrays können ihre Größe nachträglich nicht ändern!
        namen = new String[10]; // Veränderung ist nur durch Neuerzeugung möglich
        //namen = {"Tony", "Bruce"}; // Diese Schreibweise ist nur bei einer Neudeklaration eines Array möglich.
        namen = new String[]{"Tony", "Bruce"}; // Das ist OK!

        System.out.println(namen[0]);
        namen[1] = "Carol";
        System.out.println(namen[1]);
        // Indexpositionen werden erst zur Laufzeit geprüft
        // System.out.println(namen[2]); // Zur Laufzeit ein Problem

        // TODO: Aufgabe: Schreibe eine Simmulation für ein Parkhaus mit 20 Parkplätzen
        // Es können in dem Parkhaus Fahrzeuge geparkt werden
        // Jedes Fahrzeug hat eine Marke, Typ, Kennzeichen und Baujahr
        // Die Fahrzeuge werden beim Parken in ein Array abgelegt
        // Schreibe eine Methode, mit der Inhalt des Pakhauses angezeigt werden kann

    }
}
