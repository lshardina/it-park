package lesson2;
/** Выполняем арифметические операции с ДВУМЯ числами
 */
public class Arifmetika {
    public static void main(String[] args) {
        int a = 37; // сюда вписываем 1-ое число
        int b = 15; // сюда заполняем 2-ое число

        //Рассчитываем и выводим значение СУММЫ чисел
        long summa1 = summa(a,b);
        System.out.println("Сумма чисел " + a + " и " + b +" равна " + summa1);

        //Рассчитываем и выводим значение РАЗНОСТИ чисел
        long rasnost = minus(a,b);
        System.out.println("Разность чисел " + a + " и " + b +" равна " + rasnost);

        //Рассчитываем и выводим ПРОИЗВЕДЕНИЕ чисел
        long proizv1 = proizv(a,b);
        System.out.println("Произведение чисел " + a + " и " + b +" равно " + proizv1);

        //Рассчитываем и выводим ЧАСТНОЕ чисел
        double chastnoe = delenie(a,b);
        System.out.println("Частное чисел " + a + " и " + b +" равно " + chastnoe);
    }

    public static long summa(int arg1, int arg2) {
        // Расчет СУММЫ двух чисел
        long result = arg1 + arg2;
        return result;
    }

    public static long minus(int arg1, int arg2) {
        // Расчет РАЗНОСТИ двух чисел
        return arg1 - arg2;
    }

    public static long proizv(int arg1, int arg2) {
        // Расчет ПРОИЗВЕДЕНИЯ двух чисел
         return arg1 * arg2;
    }

    public static double delenie(double arg1, int arg2) {
        // Расчет ЧАСТНОГО  двух чисел
        return arg1 / arg2;

        }
}