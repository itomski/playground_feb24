package de.lubowiecki.playground;

public class MulitDimensionArrayTest {

    public static void main(String[] args) {

        int[][] zahlen1 = {{1,2,3},{4,5,6},{7,8,9}}; // Ein Array von Zahlenarrays

        System.out.println(zahlen1[2][2]);

        /*
        0: { 0: 1, 1: 2, 2: 3}
        1: { 0: 4, 1: 5, 2: 6}
        2: { 0: 7, 1: 8, 2: 9}
        */

        System.out.println();

        // {{0,0,0},{0,0,0},{0,0,0}};
        int[][] zahlen2 = new int[3][3]; // ist noch leer

        for (int i = 0; i < zahlen2.length; i++) {
            for (int j = 0; j < zahlen2[i].length; j++) {
                System.out.print(zahlen2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int[] sub : zahlen2) {
            for (int i : sub) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
