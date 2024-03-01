package de.lubowiecki.playground;

public class ZahlenTest2 {

    public static void main(String[] args) {
        long l1 = 1_00_00_00_00_00l;
        double d1 = 1_00_0000_0000.123;
        d1 = 1_00_0000_0000.123f; // float wird zu double erweitert (primitive widening)

        // byte < short < int < long < float < double

        //float f1 = 10.0; // 10.0 ist ein double. double ist größer als float
        float f1 = (float) 10.0; // nur mit einem cast möglich. Verkleinerung muss erzwungen werden

        machWas(10.0); // double
        machWas(10.0f); // float
        machWas(10); // float: da keine Methode für int vorhanden ist, primitive widening float

        float f3 = 123.567f;
        float f4 = 65.4321f;
        System.out.println(f3 / f4 / 1.5f);

        double d3 = 123.567;
        double d4 = 65.4321;
        System.out.println(d3 / d4 / 1.5);

        System.out.println(2 / 3);
        System.out.println("Erg: " + div(2, 3));
        div2(2, 3);

        System.out.println();

        System.out.println(Math.round(10.567)); // Kaufmänisches Runden
        System.out.println(Math.ceil(10.567)); // Aufrunden
        System.out.println(Math.floor(10.567)); // Abrunden

    }

    static void machWas(float v) {
        System.out.println("float");
    }

    static void machWas(double v) {
        System.out.println("double");
    }

    static double div(double a, double b) {
        return a / b;
    }

    static void div2(double a, double b) {
        System.out.println(a / b);
    }
}