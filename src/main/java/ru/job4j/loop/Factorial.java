package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}