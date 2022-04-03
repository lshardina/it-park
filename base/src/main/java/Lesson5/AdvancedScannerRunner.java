package Lesson5;

import java.util.Scanner;

public class AdvancedScannerRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пож число: ");
        while (!scanner.hasNextInt()) {
            String text = scanner.next();
            System.out.println("Ожидается целое значение: " + text);
        }//проверка на целостность знаения, введенного пользователем
        int index = scanner.nextInt();
        System.out.println("Наконец введено целое значение "+ index);
    }
}
