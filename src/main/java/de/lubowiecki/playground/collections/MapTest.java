package de.lubowiecki.playground.collections;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        Map<String, Integer> einwohner = new HashMap<>();
        einwohner.put("Hamburg", 1_900_000);
        einwohner.put("München", 1_600_000);
        einwohner.put("Berlin", 4_000_000);
        einwohner.put("Kiel", 350_000);

        System.out.println(einwohner.get("Berlin"));
        System.out.println(einwohner.getOrDefault("Münster", 0));


    }
}
