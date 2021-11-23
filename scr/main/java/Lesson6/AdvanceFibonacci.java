package Lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class AdvanceFibonacci {// Выводим значение n-го члена последовательности Фибоначчи

    public static void main(String[] args) {

        int[] numFib = new int[100]; // Инициирируем массив чисел длиной 100
        numFib[0] = 0; // Первое значение заполняем принудительно, т.к. оно не расчтеное
        numFib[1] = 1; // Второе значение заполняем принудительно, т.к. оно не расчтеное
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        while (true) {
            System.out.println("Введите, пожалуйста, номер члена последовательности Фибоначчи, или 0 для окончания");
            a = scanner.nextInt();
            if (a <= 0) { // Выход из программы по команде пользователя или в случае введения некорректного значения
                System.out.println("Конец");
                break;
            } else if (a > 2 & numFib[a] != 0) { // Выводим рассчитанные ранее числа из массива
                System.out.println("Это мы уже считали: число Фибоначчи с номером " + a + " равно " + numFib[a - 1]);
            } else {  // Расчет
                fib(a, numFib);
                System.out.println("Число Фибоначчи с номером " + a + " равно " + numFib[a - 1]);
            }
            System.out.println(Arrays.toString(numFib));
        }
    }


    public static int[] fib(int k, int numFib[]) {
        for (int i = 2; i < k; i++) {
            if (numFib[i] == 0) {
                numFib[i] = numFib[i - 2] + numFib[i - 1];
            }
        }
        return numFib;
    }

}
