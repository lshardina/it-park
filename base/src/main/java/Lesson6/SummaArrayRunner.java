package Lesson6;

public class SummaArrayRunner {

    public static void main(String[] args) {
        int[]  indexes = new int[] {1, 17, 54, 36, 92};
        int result = 0;
        for (int index: indexes) {
            result += index;
        }
        System.out.println(result);
    }
}
