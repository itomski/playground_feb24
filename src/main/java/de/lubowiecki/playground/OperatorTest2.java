package de.lubowiecki.playground;

public class OperatorTest2 {

    public static void main(String[] args) {

        int x = 10;
        x += 10; // x = (int)(x + 10);

        x++; // increment postfix
        ++x; // increment prefix
        x--; // decrement postfix
        --x; // decrement prefix

        x = 10;
               // 15 + 10 + 12
        int sum = 15 + x++ + ++x; // x wird angehoben, nachdem damit gerechnet wird
        System.out.println(sum);
        System.out.println(x);
        // x: 11

        x = 10;
           // 15 + 11 + 12
        sum = 15 + ++x + ++x; // x wird angehoben, bevor damit gerechnet wird
        System.out.println(sum);
        System.out.println(x);
        // x: 11

        x = 10;         // 10 + 11  + 11  + 13
        System.out.println(x + ++x + x++ + ++x); // das postfix wird vor der nächsten Verwendung von x realisiert

        boolean schalter1 = true;
        boolean schalter2 = false;
        // AND
        System.out.println(schalter1 && schalter2); // Beide Schalter MÜSSEN an sein

        // OR
        System.out.println(schalter1 || schalter2); // Einer der Schalter MÜSS an sein, oder beide

        // NOT
        System.out.println(!schalter1); // Dreht den Wert um

        schalter2 = true;
        // XOR
        System.out.println(schalter1 ^ schalter2); // Nur einer der Schalter darf an sein

        System.out.println();

        // shift-Operatoren

        int i1 = 32;    // 00100000
        i1 = i1 >>> 2;  // 00001000
        System.out.println(i1);
        System.out.println(Integer.toBinaryString(i1));

        System.out.println();

        i1 = 34;        // 00100010
        i1 = i1 & 2;    // 00000010
                        // 00000010

        System.out.println(i1);
        System.out.println(Integer.toBinaryString(i1));
    }
}
