package Lesson6;

import java.util.Arrays;

public class WordReducerRunner {
    public static void main(String[] args) {
        String [] words = {"fff", "eeee", "ooo", "wwww", "ooo"};
        System.out.println(Arrays.toString(intersect(words, "ooo")));
        System.out.println(Arrays.toString(intersect(words, "eeee")));

    }

    public static String[] intersect (String[] initialArray, String word) {
                String[] result = new String[initialArray.length];
                System.arraycopy(initialArray, 0, result, 0, initialArray.length);
                for (int i = 0; i < result.length; i++) {
                    if (result[i].equals(word)) {
                        result[i] = null;
                    }
                }
                int maxNotNullIndexes = 0;
                for (String str : result) {
                    if (str != null) {
                        maxNotNullIndexes++;
                    }
                }

                String[] newResult = new String[maxNotNullIndexes];
                int counter = 0;
                for (String str : result) {
                    if (str != null) {
                        newResult[counter++] = str;
                    }
                }
                return newResult;
    }
}
