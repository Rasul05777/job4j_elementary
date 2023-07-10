package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
        active = false;
        status = 1;
        message = "В программе найдены ошибки";

    }

    public void printInfo() {
        System.out.println("Активация программы " + active);
        System.out.println("Ошибок найдено " + status);
        System.out.println("Программа работает " + message);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 0, "успешно");
        error.printInfo();
    }
}
