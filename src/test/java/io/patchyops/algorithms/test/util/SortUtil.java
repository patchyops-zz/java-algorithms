package io.patchyops.algorithms.test.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class SortUtil {

    public static int[] getRandomArray (int size) {
        Random rn = new Random();
        int[] random = new int[size];
        for (int i =0; i < size; i++) {
            random[i] = rn.nextInt();
        }
        return random;
    }

    public static int[] getSortedArray (int[] input) {
        int[] sorted = Arrays.copyOf(input, input.length);
        Arrays.sort(sorted);
        return sorted;
    }

    public static int[] getReverseSortedArray (int[] input) {
        Integer[] boxedInput = boxArray(input);
        Arrays.sort(boxedInput, Collections.reverseOrder());
        return unboxArray(boxedInput);
    }

    private static Integer[] boxArray (int[] input) {
        Integer[] result = new Integer[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = input[i];
        }
        return result;
    }

    private static int[] unboxArray (Integer[] input) {
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = input[i];
        }
        return result;
    }
}
