package de.lubowiecki.playground.designpatterns.composite;

// abstract bedeutet, dass diue Klasse noch nicht fertig ist
// Abstrakte Klassen müssen Interfaces nicht vollständig erfüllen
// Abstrakte Klassen können nicht instanziert werden
public abstract class AbstractGeoForm implements GeoForm {

    private int x;

    private int y;

    public AbstractGeoForm(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void moveTo(int a, int b) {
        this.x = a;
        this.y = b;
    }
}
