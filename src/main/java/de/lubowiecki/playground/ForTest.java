package de.lubowiecki.playground;

import java.util.Arrays;

public class ForTest {

    public static void main(String[] _A_V_) {

        // int i = 100 wird einmalig beim Start der Schleife ausgeführt
        // i < 100 wird bei jedem Durchlauf geprüft
        // Wenn wahr, wird der Block ausgeführt
        // Und erst danach i--
        for(int i = 3; i > 0; --i) { // Scope von i ist auf die Schleife beschränkt
            System.out.println(i);
        }

        System.out.println();

        int i = 3; // Scope von i auf die ganze main-Methode beschränkt
        for(; i > 0; --i) {
            System.out.println(i);
        }

        /*
        for(int i = 3; i > 0; --i) { // i ist bereits in diesem Scope deklariert
            System.out.println(i);
        }
        */

        // 0 1 2 3
        for(int x = 0; ++x < _A_V_.length;) {
            System.out.println(_A_V_[x]);
        }

        /*
        for(;;) { // Endlosschleife
            //...
        }
        */

        // for(int j = 0;; System.out.println(j++)); // Endlosschleife

        // Zum Durchlaufen von Sammlungen
        String[] namen = {"Bruce", "Peter", "Carol", "Natasha", "Scott"};

        // Für Arrays und Collections
        for (String name : namen) {
            System.out.println(name);
        }

        System.out.println();
        System.out.println(Arrays.toString(namen));

        // Array ändern: Nicht möglich
        for (String name : namen) { // Keine Information über die Anzahl Durchläufe
            // Änderung des Zustandes eines Objektes ist möglich
            // Aber nicht die Neuzuweisung
            name = name.toLowerCase();
        }

        System.out.println(Arrays.toString(namen));

        // Array ändern: Ok
        for (int j = 0; j < namen.length; j++) {
            namen[j] = namen[j].toLowerCase();
        }

        System.out.println(Arrays.toString(namen));

    }
}
