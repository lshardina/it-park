package lesson2;
//Процедура расчета площади круга по заданному радиусу

public class S_Сircle {
    public static void main(String[] args){
        int rr = 4;  //в переменную rr забиваем значение радиуса круга
        double ss = result(rr);
        System.out.println("Площадь круга с радиусом " + rr + " см равна: ");
        System.out.println("S = " + ss +" кв.см");
    }

    public static double result (int r) {
        final double Pi = 3.1415926536;
        double s = Pi * Math.pow(r,2);
        return s;

    }
}
