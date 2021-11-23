package Lesson5;

public class IntRunner {
    public static void main(String[] args) {
        int i = 5;
        String str = "Привет";
        String another = new String("Hello");
        Integer value = 5;
        int anotherValue = value;
        Integer nullValue = null;
//        System.out.println(nullValue + 10);
    //    Character symbol = 'мсмьчи';
        Integer integer = Integer.valueOf("344572345");
        System.out.println("Проблем с конвертацией " + integer + " не обнаружено");
        System.out.println("---------");
        System.out.println(integer == 344572345);

    }
}
