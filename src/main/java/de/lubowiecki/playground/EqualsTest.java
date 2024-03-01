package de.lubowiecki.playground;

import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

public class EqualsTest {

    public static void main(String[] args) {

        Kreis k1 = new Kreis(10, 15, 200);
        Kreis k2 = new Kreis(10, 15, 300);
        Kreis k3 = null;

        System.out.println(k1); // toString wird automatisch benutzt
        System.out.println(k2);

        System.out.println(k1 == k2); // false
        System.out.println(k1.equals(k2)); // true?
        System.out.println(k1.equals(k3)); // beim vergleich mit null bekommen wir IMMER false!!!
        System.out.println(k3.equals(k1)); // NullPointerException


        System.out.println();

        int[] arr1 = new int[3]; // 0:0, 1:0, 2:0
        int[] arr2 = new int[3]; // 0:0, 1:0, 2:0
        System.out.println(arr1.equals(arr2)); // in array ist die equals-Methode nicht überschrieben
        System.out.println(Arrays.equals(arr1, arr2));

    }
}

class Kreis {

    private int x;
    private int y;
    private int radius;

    public Kreis(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Wird automatisch verwendet, wenn man versucht print auf dem Objekt zu verwenden
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kreis{");
        sb.append("x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }

    // Will ich den Zustand von Objekten vergleichen, dann muss ich der Klasse die equals-Methode
    // überschrieben sein

    @Override // Annotation. Hienweis darauf, dass eine soleche Methode in der Elternklasse vorhanden ist
    // und mit dieser Variante ersetzt/überschrieben wird
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kreis kreis = (Kreis) o;
        return x == kreis.x && y == kreis.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
