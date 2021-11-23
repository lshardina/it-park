package Lesson4;

public class IfElseRunner {

    public static void main(String[] args) {
        int value = 25;
        int y = 34;
        if (value > 20) {
            if (y < 100) {
                y = 27;
            }
        } else {
            value = 14;
        }
        System.out.println(value);
        System.out.println(y);
    }
}
