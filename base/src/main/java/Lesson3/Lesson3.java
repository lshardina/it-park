package Lesson3;

public class Lesson3 {
    public static void main (String[] agrs) {
        byte a = 123; // -128, ...-1,0,1,...127
        byte errDigit = (byte) 128;
        System.out.println(errDigit);
        short b = 676; //-2^15,...,2^15 - 1
        int c = Integer.MAX_VALUE; //-2^31,...,2^31 - 1
        System.out.println(c);
        long d = 2147483648L; // -2^63,...,2^63 - 1

        char symbol = 'Я'; // 16-ти битный 0...2^16-1
        System.out.println(symbol + 0); // + 1 - прибавление 1 дает приведение к целому числу

        double digitWithPoint = 2.7396; // 64 битный
        float floatValue = 100.86863F; // 32 битный

        boolean flag = true; // истина
        boolean lie = false; // ложь
        System.out.println(flag);
        boolean value = 100 == 100_000;
        // System.out.println(value);
        boolean notValue = !value; //обратное значение к value
        //System.out.println(notValue);
        boolean trueValue = true != false; //не рекомендуется
        boolean complexAnd = (100 == 100) & (125 == 125); // true = true & true
        boolean complexOr = (100 == 100) | (125 == 125); // true = true | true
        //System.out.println(complexAnd);
        // System.out.println(complexOr);

        if (value) {
            System.out.println("Переменная value истинна");
        } else {
            System.out.println("Переменная value ложна");
        }

        double floatingPointValue = 1.5;
        if (2.5 == floatingPointValue) {
            System.out.println("2.5 равно " + floatingPointValue);
        } else {
            System.out.println("2.5 не равно " + floatingPointValue);
        }

    }
}

