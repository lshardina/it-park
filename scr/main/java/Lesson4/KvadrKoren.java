package Lesson4;

import java.util.Scanner;

public class KvadrKoren {

    // Вычисление квадратного корня из заданного числа
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите неотрицательное число:");
        int b = scanner.nextInt();
        if (b < 0) {
            System.out.println("Из отрицательного числа нельзя извлекать квадратный корень");
        } else {
            int a = 0;
            while (a * a < b) {
                a++;
            }
            if (a * a == b) {
                System.out.println("√" + b + " = " + a);
            } else {
                System.out.println("К сожалению, из числа " + b + " нельзя извлечь целый квадратный корень");
            }
        }
    }
}
