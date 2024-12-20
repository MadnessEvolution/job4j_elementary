package ru.job4j.loop;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(PrimeNumber.calc(5));
        System.out.println(PrimeNumber.calc(11));
        System.out.println(PrimeNumber.calc(2));
        System.out.println(PrimeNumber.calc(25));
        System.out.println(PrimeNumber.calc(49));
    }
}