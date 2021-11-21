package Lesson5;

import java.util.Scanner;

public class Fibonacchi { // Выводим значение n-го члена последовательности Фибоначчи
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите, пожалуйста, целое положительное число:");
        int a = scanner.nextInt();
        if (a <= 0) {
            System.out.println("Извините, нумерация членов последовательности начинается с 1");
        } else if (a == 1) {
            System.out.println("Первое число Фибоначчи равно 0");
        } else if (a == 2) {
            System.out.println("Второе число Фибоначчи равно 1");
        } else {
            int r3 = fib(a);
            System.out.println("Число Фибоначчи с номером " + a + " равно " + r3);
        }
    }

    public static int fib(int k) {
        int res1 = 0;
        int res2 = 1;
        int res3 = 0;
        for (int i = 0; i <= k - 3; i++) {
            res3 = res1 + res2;
            res1 = res2;
            res2 = res3;
        }
        return res3;
    }
}






