package ru.job4j.condition;

public class TgrArea {

        public static double area(double a, double b, double c) {
            double rsl = Math.sqrt(6 * (6 - a) * (6 - b) * (6 - c));
            return rsl;
        }

        public static void main(String[] args) {
            double rsl = TgrArea.area(2, 2, 2);
            System.out.println("area (2, 2, 2) = " + rsl);
        }
}
