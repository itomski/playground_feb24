package de.lubowiecki.playground;

// Für Klassen ist public oder package-private möglich
public class VariablenTest {

    public int z; // Klassen und Instanzvariablen, die nicht initialisiert sind bekommen Standardwerte
    // Das gilt aber NICHT für lokale Variablen

    private int i; // Instanzvariabel
    private final int ZAHL = 100; // Instanzkonstante

    private static int j; // Klassenvarible
    private final static int ANDERE_ZAHL = 200; // Klassenkonstante

    // Klassenkonstanten müssen gleich ihren Wert bekommen
    // Instanzkonstanten müssen spätestens im Konstruktor ihren Wert bekommen

    public static void main(String[] args) {

        final int x = 100;
        System.out.println(x);
        //x = 120; // Neuzuweisung nicht möglich. Es ist eine Konstante

        final String s = "Hallo Welt";
        // s = "Hi andere Welt..."; // Bei Objekten darf die Referenz nicht geändert werden

        final int[] arr = new int[10];
        //arr = new int[5]; // Veränderung der Referenz nicht erlaubt
        arr[2] = 15; // Veränderung des Inhalts ist erlaubt

        int z; // Deklaration
        z = 50; // Initialisierung
        // Lokale Variablen müssen initialisiert sein, bevor sie verwendet werden
        System.out.println(z);


        System.out.println(10); // 10 ist ein Literal
        int a = 10;
        System.out.println(a); // a ist ein KEIN Literal

        System.out.println(100000000000000L);

    }


    private void machWas() { // Instanzmethode
        // Lokale Variablen und Parameter bekommen keine Access-Modifier
        int i = 10; // Lokale Variable
    }

    // i ist ein Parameter = wird wie eine lokale Variable behandelt
    private static void machWasAnderes(int i) { // Klassenmethode

    }
}
