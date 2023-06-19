package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int a = array.length - 1;
        while (i < a) {
            if (array[i] + array[a] == target) {
                return new int[] {i, a};
            } else if (array[i] + array[a] < target) {
                i++;
            } else {
                a--;
            }
        }
        return new int[0];
    }
}
