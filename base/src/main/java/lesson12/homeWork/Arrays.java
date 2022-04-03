package lesson12.homeWork;


import lesson12.homeWork.myException.MyArrayDataException;
import lesson12.homeWork.myException.MyArraySizeException;

import java.util.Scanner;

public class Arrays {

    private final int m;
    private final int n;
    private String name;
    private String[][] array;

    public Arrays(String name) {
        this(name, 4, 4);
    }

    public Arrays(String name, int m, int n) {
        this.m = m;
        this.n = n;
        this.name = name;
        this.array = new String[m][n];
    }

    public void setArray(int m, int n, String value) {
        this.array[m][n] = value;
    }

    public void printArray() {
        System.out.println("Матрица " + this.name + " имеет вид:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.print("\n");
        }
    }

    public void summArray() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == null) {
                    System.out.println("Значение в ячейке (" + (i + 1) + " ; " + (j + 1) + ") не заполнено, продолжить расчет?");
                    System.out.println("Введите 1 - продолжить расчет, или 0 - закончить расчет и перейти к следующей матрице");
                    Scanner scanner = new Scanner(System.in);
                    int c;
                    c = scanner.nextInt();
                    if (c == 1) {
                        sum += 0;
                    } else {
                        System.out.println("Расчет по матрице " + this.getName() + " отменен.");
                        System.out.println("-----------------------------------------------------------------");
                        return;
                    }
                } else {
                    try {
                        sum += Integer.parseInt(this.array[i][j].trim());
                    } catch (NumberFormatException exception) {
                        throw new MyArrayDataException(i, j, this.array[i][j], "Обнаружено нечисловое значение в массиве");
                    }
                }
            }
        }
        System.out.println("Сумма членов матрицы " + this.name + " равна: " + sum);
        System.out.println("---------------------------------------------------------");
    }

    public void controlSize() {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Некорректный размер матрицы");
        }
    }

    public String getName() {
        return name;
    }
}
