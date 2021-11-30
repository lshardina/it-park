package Lesson7;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayRunners {

    public static void main(String[] args) {
        Integer[] nums = {167, 83, 6783, 345};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums, Comparator.reverseOrder());
        System.out.println(Arrays.toString(nums));
        System.out.println(summa(1, 2));
    }

    public static int summa(int arg1, int arg2) {
        return arg1 + arg2;
    }
}
