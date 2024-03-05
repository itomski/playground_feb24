package de.lubowiecki.uebung3;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Board {

    private final String[][] FILEDS;

    public Board(int size) {
        FILEDS = new String[size][size];
    }

    public Board() {
        FILEDS = new String[10][10]; // Default
    }

    public void print() {

        for(String[] rows : FILEDS) {
            for(String cell : rows) {
                if(cell == null) System.out.print(" . ");
                else System.out.print(" @ ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean setBot(int x, int y) {
        reset();
        FILEDS[x][y] = "x";
        return true;
    }

    public void reset() {
        for (String[] row : FILEDS) {
            Arrays.fill(row, null);
        }
    }
}
