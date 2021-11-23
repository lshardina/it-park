package Lesson5;

import java.util.Scanner;

public class PrimeNumberRunner {

    public static void main(String[] args) {
        System.out.println("Пожалуйста, введите число");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
        }
        int limit = scanner.nextInt();
        printPrimeNumbers(limit);
    }

    public static void printPrimeNumbers(int threshold) {
        if (threshold <= 1) {
            System.out.println("Ожидается значение больще 1");
        }


        for (int i = 1; i < threshold; i++) {
            if (isPrime(i)) {
                System.out.println("текущее знаяение " + i + " явлется простым");
            }
        }
    }

    public static boolean isPrime(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
