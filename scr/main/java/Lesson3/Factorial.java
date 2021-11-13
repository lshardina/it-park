package Lesson3;

public class Factorial {
    public static void main(String[] args) {
        // Вычисление факториала числа
        int n = 3; // Сюда заполняем целое число, от которого хотим посчитать значение факториала (первый способ)
        int m = 8; // Сюда заполняем целое число, от которого хотим посчитать значение факториала (второй способ)
        int i = 1;
        int res = 1;
        int result1 = sposob1(i, n, res);
        System.out.println(n + "! = " + result1);
        int result2 = sposob2(i, m, res);
        System.out.println(m + "! = " + result2);
    }

    public static int sposob1(int i1, int n1, int res1) {
        res1 = 1;
        while (i1 < n1) {
            res1 = res1 * (i1 + 1);
            i1++;
        }
        return res1;
        //System.out.println(n + "! = " + res);
    }

    public static int sposob2(int i2, int n2, int res2) {
            for (i2 = 1; i2 < n2; i2++) {
            res2 = res2 * (i2 + 1);
        }
        return res2;
    }


}
