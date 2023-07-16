package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int up) {
        int one = max(right, up);
        return one > left ? one : left;
    }

    public static void main(String[] args) {
        int result = Max.max(15, 5, 21);
        System.out.println("Наибольшее из двух чисел = " + result);
    }
}