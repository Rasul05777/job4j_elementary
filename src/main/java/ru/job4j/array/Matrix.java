package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int a = 0; a < size; a++) {
                 array[i][a] = (i + 1) * (a + 1);
            }
        }
        return  array;
    }
}
