package de.lubowiecki.playground;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

//import org.apache.commons.math3.analysis.ParametricUnivariateFunction;

public class StaticImportTest {

    // Alle Konstanten (final) die sichtbar sind werden in SCREAMING_SNAKE_CASE geschrieben
    // snake_case wird in Java gar nicht verwendet!
    // camelCase wird für Variablen und Methodennamen verwendet
    // Eigenschaft: geburtsDatum
    // Methode: getGeburtsDatum()

    public static void main(String[] args) {

        //final double PI = 3.14;
        //System.out.println(PI);

        System.out.println(Math.PI);

        System.out.println(10 + Math.PI * 2);

        // Statisches Inventar kann mit statischen imports geholt werden
        // anschließend kann es verwendet werden, als würde es in dieser Klasse deklariert sein
        System.out.println(10 + PI * 2); // PI ist statisch importiert
        System.out.println(10 + pow(5,5)); // pow ist statisch importiert

        // Weitere Funktionalitäten liegen in Apache Commons Math

    }
}
