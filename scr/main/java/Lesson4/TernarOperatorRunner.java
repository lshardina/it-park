package Lesson4;

public class TernarOperatorRunner {

    public static void main(String[] args) {
        System.out.println(abs(25));
        System.out.println(abs(-14));
    }

    public static int abs(int value) {
        return value >= 0 ? value : -value;

    }
}
