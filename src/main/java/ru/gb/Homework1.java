package ru.gb;

public class Homework1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSunSign();
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSunSign() {
        int a = 13, b = 42;
        int c = a + b;
        System.out.println("Сумма " + (c >= 0 ? "положительная" : "отрицательная"));
    }
}
