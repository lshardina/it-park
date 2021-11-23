package Lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinAvg {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("Привет! Сначала сгенерируем числа от 0 до 100. Сколько их будет? Введи число:");
        a = scanner.nextInt();
        double[] numbers = new double[a]; //Инициализируем пустой массив
        int i;
        for (i = 0; i < a; i++) { // Заполняем массив случайными числами
            numbers[i] = Math.random() * 100;
        }
        System.out.println("Сгенерирован ряд чисел:");
        System.out.println(Arrays.toString(numbers));
        double maxvalue = maxArray(numbers);
        System.out.println("Максимальное значение в ряду - " + maxvalue);
        double minvalue = minArray(numbers);
        System.out.println("Минимальное значение  в ряду - " + minvalue);
        double avgvalue = avgArray(numbers);
        System.out.println("Среднее значение чисел в ряду равно " + avgvalue);
    }

    private static Double maxArray(double[] numbers) { //Рассчитываем МАХ
        double numbers1[] = new double[numbers.length]; // Сначала создаем вспомогательный массив, чтобы не "испортить" цифры в исходном
        for (int j = 0; j < numbers1.length; j++) {
            numbers1[j] = numbers[j];
        }
        for (int i = 0; i < numbers1.length - 1; i++) { // Попарно сравниваем значения в массиве
            if (numbers1[i] > numbers1[i + 1]) {
                numbers1[i + 1] = numbers1[i];
            }
        }
        return numbers1[numbers1.length - 1];
    }

    private static Double minArray(double[] numbers) { //Рассчитываем MIN
        double numbers2[] = new double[numbers.length]; // Создаем вспомогательный массив
        for (int j = 0; j < numbers2.length; j++) {
            numbers2[j] = numbers[j];
        }
        for (int i = 0; i < numbers2.length - 1; i++) { // Попарно сравниваем значения в массиве
            if (numbers2[i] < numbers2[i + 1]) {
                numbers2[i + 1] = numbers2[i];
            }
        }
        return numbers2[numbers2.length - 1];
    }

    private static Double avgArray(double[] numbers) { // Рассчитываем среднее
        double result = 0;
        for (int i = 0; i < numbers.length; i++) { //Суммируем элементы массива
            result = result + numbers[i];
        }
        return (result / (numbers.length)); //Полученную сумму делим на длину массива
    }


}




