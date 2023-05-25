package ru.job4j.condition;

public class Convert {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Convert.rubleToEuro(140);
        float dollar = Convert.rubleToDollar(180);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println(("180 rubles are " + dollar + " dollar"));
    }
}
