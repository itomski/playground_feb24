package de.lubowiecki.playground.designpatterns.composite;

public class CompositeTest {

    public static void main(String[] args) {

        Circle c1 = new Circle(10, 15, 200);
        c1.print();
        // Über c1 ist auch Getter und Setter für radius sichtbar

        Rect r1 = new Rect(22, 18, 50, 100);
        r1.print();
        // Über c1 ist auch Getter und Setter für height und width sichtbar

        System.out.println();

        /*
        AbstractGeoForm agf1 = new Circle(10, 15, 200);
        agf1 = new Rect(22, 18, 50, 100);
        // über agf1 können auch die Getter und Setter für x und y genutzt werden

        GeoForm gf1 = new Circle(10, 15, 200);
        // über gf1 werden NUR Methoden sichtbar, die im Interface deklariert sind
        gf1.moveTo(80, 80);
        gf1.print();

        System.out.println();

        gf1 = new Rect(22, 18, 50, 100);
        gf1.moveTo(100, 100);
        gf1.print();
        */

        GeoFormGroup group = new GeoFormGroup(c1, r1);

        group.add(new Rect(17, 2, 20, 20));
        group.add(new Circle(3, 3, 100));

        group.print();
        System.out.println();

        group.moveTo(200, 200);
        group.print();

        GeoFormGroup group2 = new GeoFormGroup(new Rect(2,2, 100, 100), new Rect(-1, 15, 200, 750));

        System.out.println();
        group.add(group2);
        group.print();

        System.out.println();
        group.moveTo(-10, -20);
        group.print();
    }
}
