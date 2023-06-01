package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] i = new int[5];
        for (int index = 0; index < i.length; index++) {
            i[index] = index * 2 + 3;
        }
        for (int index = 0; index < i.length; index++) {
            System.out.println(i[index]);
        }
    }
}
