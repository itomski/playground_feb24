package de.lubowiecki.playground.vererbung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DefaultMethodTest2 {

    public static void main(String[] args) {

        List<String> namen = new ArrayList<>(Arrays.asList("Tony", "Carol", "Bruce", "scott", "Natasha"));

        // FunctionalInterface
        Predicate<String> pred1 = s -> s.toUpperCase().startsWith("S"); // Lambda
        Predicate<String> pred2 = s -> s.length() > 6;

        namen.removeIf(pred1.or(pred2));
        //namen.removeIf(s -> s.startsWith("S"));

        System.out.println(namen);

    }
}
