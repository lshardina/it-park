package Lesson4;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerRunner {
    public static void main(String[] args) {
        Scanner   scanner = new Scanner(System.in);
        System.out.println("Представьтесь");
        String userName = scanner.nextLine();
        System.out.println("Добро пожаловать, " + userName + ". Введите число:");
        int value = scanner.nextInt();
        System.out.println("Подтвердите, что Вы ввели " + value);
    }
}
