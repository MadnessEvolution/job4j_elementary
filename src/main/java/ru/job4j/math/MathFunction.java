package ru.job4j.math;

public class MathFunction {

    public static double sum(double first, double second) {
        return first + second;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double subtract(double first, double second) {
        return first - second;
    }

    public static double divide(double first, double second) {
        if (second == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return first / second;
    }
}