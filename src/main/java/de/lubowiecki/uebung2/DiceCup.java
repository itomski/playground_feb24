package de.lubowiecki.uebung2;

import java.util.Random;

public class DiceCup {

    private Random rand = new Random();

    private int size = 6; // Standard Anzahl der Augen

    public DiceCup(int size) {
        this.size = size;
    }

    public DiceCup() {
    }

    public int roll() {
        return rand.nextInt(size) + 1;
    }

    public int[] roll(int num) {

        int[] results = new int[num];
        for (int i = 0; i < results.length ; i++) {
            results[i] = roll();
        }
        return results;
    }

    public String stats(int[] results) {

        int[] stats = new int[size];
        /*
        0: 1 -> hier stehen die 1er
        1: 0
        2: 0
        3: 2
        4: 1
        5: 1 -> hier stehen die 6er
        */

        // 6,5,2,2,1

        for (int i = 0; i < results.length; i++) {

            int index = results[i] - 1; // -1 da Positionen im Array bei 0 beginnen
            stats[index]++; // ++ Wert an der gewünschten Position um 1 hochzählen
        }

        // TODO: Auf StringBuilder umstellen
        String output = "";

        for (int i = 0; i < stats.length; i++) {
            output += stats[i] + " mal " + (i + 1) + "\n";
        }

        return output;
    }
}
