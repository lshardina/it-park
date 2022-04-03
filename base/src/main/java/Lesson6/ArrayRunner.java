package Lesson6;

import java.util.Arrays;
import java.util.Random;

public class ArrayRunner {
    public static void main(String[] args) {

        char[] symbols = new char[10];
//        symbols[0] = '\u0000'; //0
        printArray(symbols);
        fillArray(symbols);
        System.out.println("-----------------");
        printArray(symbols);
        System.out.println("-----------------");
        System.out.println(index0f(symbols, 'я'));
        System.out.println(index0f(symbols, 'ж'));
        System.out.println("-----------------");
        System.out.println(String.valueOf(symbols));
        int[] intArray = new int[100]; // 0
        boolean[] booleans = new boolean[5]; // false
        String [] str = new String[3]; // null
        double[] doubleArray = new double[]{0.1, 45.2, 46};
        System.out.println(Arrays.toString(doubleArray));
        String [] strings = {"Привет", "Мир"};
        String string = strings[strings.length - 1]; // обращение к комледнему элементу массива
        System.out.println(string); // печать последнего элемента массива
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(weekDays()));

    }

    private static void printArray(char[] symbols) {
//        for (int i = 0; i < symbols.length; i++) {
//               System.out.println(symbols[i]);
           for (char symbol : symbols) {
            System.out.println(symbol);
        }
    }

    private static void fillArray(char[] symbols) {
        symbols[0] = 'а';
        symbols[1] = 'б';
        symbols[2] = 'в';
        symbols[3] = 'г';
        symbols[4] = 'в';
        symbols[5] = 'е';
        symbols[6] = 'ж';
        symbols[7] = 'з';
        symbols[8] = 'и';
        symbols[9] = 'к';
        }


    public static int index0f(char[] symbols, char searchElement) {
            for (int i=0; i < symbols.length; i++){
                if (symbols[i] == searchElement) {
                    return i;
                }
            }
            return -1;
        }



    public static String[] weekDays () {
        Random random = new Random();
        return random.nextBoolean() ? new String[] {"Mon", "Tue"} : new String[]{} ; // выражение new String[]{} в конце - присваивает длину 0 массиву
    }
}
