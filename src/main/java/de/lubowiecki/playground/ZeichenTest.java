package de.lubowiecki.playground;

public class ZeichenTest {

    public static void main(String[] args) {

        char c1 = 64213;
        System.out.println(c1);
        c1 = 'x';
        c1 = 'X';
        System.out.println(c1);
        System.out.println((int)c1);
        System.out.println((double)c1);
        double d = 'c'; // primitive Widening von char auf double
        System.out.println(d);

        // byte < short < int < long etc.
        //         char <

    }
}
