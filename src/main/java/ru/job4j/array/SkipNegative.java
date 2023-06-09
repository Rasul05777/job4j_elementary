package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int a = 0; a < array[i].length; a++) {
                if (array[i][a] < 0) {
                    array[i][a] = 0;
                }
            }
        }
        return array;
    }
}
