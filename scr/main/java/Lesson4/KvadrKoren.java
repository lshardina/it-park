package Lesson4;

import java.util.Scanner;

public class KvadrKoren {

    // Вычисление квадратного корня из заданного числа
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите число:");
        int b = scanner.nextInt(); // Число, из которого нужно извлечь квадратный корень
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
