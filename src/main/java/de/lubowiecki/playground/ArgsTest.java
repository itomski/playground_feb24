package de.lubowiecki.playground;

import java.util.Arrays;

public class ArgsTest {

    public static void main(String[] args) { // CLI-Parameter werden als Strings eingelesen

        // Aufruf auf der CMD
        // java de.lubowiecki.playground.ArgsTest Peter Carol Bruce Tony

        //System.out.println(Arrays.toString(args));

        for (int i = 0; i < args.length ; i++) {
            sayHallo(args[i]);
        }

        System.out.println(getSum());
        System.out.println(getSum(1,2,3));
        System.out.println(getSum(1,2,3,5,6,7,10,22,19,100));
        System.out.println(getSum(new int[]{1,2,3}));
        System.out.println(getSum(new int[10]));
    }

    // Wird nicht automatisch verwendet
    public static void main(String args) {
    }

    static void sayHallo(String name) {
        System.out.println("Hallo " + name);
    }

    static int getSum(int... values) { // VarArgs
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
}
