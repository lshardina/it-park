package Lesson7;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayRunners {

    public static void main(String[] args) {
        Integer[] nums = {67, 83, 6783, 345};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums, Comparator.reverseOrder());
        System.out.println(Arrays.toString(nums));
    }
}
