package de.lubowiecki.playground;

public class KonstruktorTest {


    public KonstruktorTest() { // Es wird kein Rückgabetyp angegeben, da es immer ein Objekt dieser Klasse ist!!!!
    }

    // Das ist KEIN Konstruktor!!!!
    public byte KonstruktorTest() {
        return 10;
    }
}
