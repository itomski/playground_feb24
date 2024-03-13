package de.lubowiecki.playground.designpatterns.composite;

public interface GeoForm {

    int ZAHL = 10; // ist eine statische Konstante und public ist es auch!

    void print();

    void moveTo(int x, int y);

}
