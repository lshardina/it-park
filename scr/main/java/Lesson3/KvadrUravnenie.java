package Lesson3;

public class KvadrUravnenie {
// Рассчитываем корни приведенного квадратного уравнения

    public static void main(String[] args) {
        double a = -11; // Значение "а" - коэффициента перед x²
        double b = -2; // Значение "b" - коэффициента перед х
        double c = 8; // Значение "с" - свободного члена
        double d = Math.pow(b,2) - 4 * a * c;
        double x1 = (-b - Math.pow(d,0.5)) / (2 * a);
        double x2 = (-b + Math.pow(d,0.5)) / (2 * a);

        // Если дискриминант отрицательный - нет корней:
        if (d < 0) { //Отображаем знаки "+" в уравнении в зависимости от заданных значениий: минусы программа ставит сама
            System.out.print("Увы, квадратное уравнение " + a + "x² ");
            if (b < 0) {
                System.out.print(b + "x ");
            } else {
                System.out.print("+" + b + "x ");
            }
            if (c < 0) {
                System.out.println( c + " = 0");
            } else {
                System.out.println("+"+ c + " = 0");
            }
            System.out.println("не имеет корней в области действительных чисел");
        //Если дискриминат равен 0 - один корень:
        } else if (d == 0) {
            System.out.print("Корнем квадратного уравнения " + a + "x² ");
            if (b < 0) {//Отображаем знаки "+" в уравнении в зависимости от заданных значениий: минусы программа ставит сама
                System.out.print(b + "x ");
            } else {
                System.out.print("+" + b + "x ");
            }
            if (c < 0) {
                System.out.println( c + " = 0");
            } else {
                System.out.println("+"+ c + " = 0");
            }
            System.out.println("является x = " + x1);
        //Если дискриминант положительный - два корня:
        } else {
            System.out.print("Корнями квадратного уравнения " + a + "x² ");
            if (b < 0) {//Отображаем знаки "+" в уравнении в зависимости от заданных значениий: минусы программа ставит сама
                System.out.print(b + "x ");
            } else {
                System.out.print("+" + b + "x ");
            }
            if (c < 0) {
                System.out.println( c + " = 0");
            } else {
                System.out.println("+"+ c + " = 0");
            }
            System.out.println("являются x1 = " + x1 + " и х2 = " + x2);
        }

    }
}
