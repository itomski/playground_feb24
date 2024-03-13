package de.lubowiecki.playground.designpatterns.composite;

public class Circle extends AbstractGeoForm {

    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void print() {
        System.out.printf("Circle: x %d, y %d, r %d \n", getX(), getY(), radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
