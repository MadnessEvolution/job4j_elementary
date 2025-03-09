package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        for (int i = 1; i < data.length; i++) {
            if (data[i] != first) {
                return false;
            }
        }
        return true;
    }
}