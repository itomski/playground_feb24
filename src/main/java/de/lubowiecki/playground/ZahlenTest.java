package de.lubowiecki.playground;

public class ZahlenTest {

    public static void main(String[] args) {

        int i = 020; // Oktal
        i = 011; // 9
        System.out.println(i);

        i = 0b10000; // Binär
        System.out.println(i);

        i = 16; // Dezimal
        System.out.println(i);

        i = 0x10; // Hex 0-9abcdef
        System.out.println(i);

        i = 1235;
        System.out.println(Integer.toHexString(i));
        System.out.println(Integer.toOctalString(i));
        System.out.println(Integer.toBinaryString(i));

    }
}
