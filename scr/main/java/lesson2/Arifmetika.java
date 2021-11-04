package lesson2;

public class Arifmetika {
    public static void main(String[] args) {
        long summa1 = summa(5,3);
        System.out.println(summa1);
        long summa2 = summa(6,4637);
        System.out.println(summa2);
        long rasnost = minus(345,1111);
        System.out.println(rasnost);
        long multy = multiplyAndSumma(11);
        System.out.println(multy);
    }

    public static long summa(int arg1, int arg2) {
        /** здесь будет храниться результат сложения
            результат сложения должен быть совместим по типу с аргументами
            еще одна строка
        */
        long result = arg1 + arg2;
        return result;
    }

    public static long minus(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public static long multiplyAndSumma(int arg1) {
        int result = 3 * arg1 + 12 ;
        result = result - 15;
        return result;
    }
}