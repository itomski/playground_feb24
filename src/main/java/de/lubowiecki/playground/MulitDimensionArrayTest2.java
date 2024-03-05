package de.lubowiecki.playground;

public class MulitDimensionArrayTest2 {

    public static void main(String[] args) {

        // Indexpositionen und Array-Größe kann erst zur Laufzeit geprüft werden
        // Indexpositionen und Größe ist immer positives int

        //Object[] objects = new Object[-100]; // NegativeArraySizeException
        Object[] objects = new Object[100];
        System.out.println(objects[100]); // ArrayIndexOutOfBoundsException


        int[][] zahlen1 = new int[5][5]; // symetrisch

        // {{0,0}, {0,0}, {0,0}, {0,0}, {0,0}}
        zahlen1 = new int[5][2]; // symetrisch

        // {null, null, null, null, null}
        zahlen1 = new int[5][]; // Erste Dimension MUSS eine größe bekommen. Weitere können.

        // {{0,0,0}, null, null, null, null}
        zahlen1[0] = new int[3];

        // {{0,0,0}, {7,9,22,18,100}, null, null, null}
        zahlen1[1] = new int[]{7,9,22,18,100};

        // {{0,0,0}, {7,9,22,18,100}, {0,0,0,0,0}, null, null}
        zahlen1[2] = new int[5];
        // {{0,0,0}, {7,9,22,18,100}, {0,200,0,0,0}, null, null}
        zahlen1[2][1] = 200;

        zahlen1[3] = new int[2];
        zahlen1[4] = new int[20];

        for (int[] sub : zahlen1) {
            for (int i : sub) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Object o1 = new Person();
        // o1 = new String("...");

    }

}
