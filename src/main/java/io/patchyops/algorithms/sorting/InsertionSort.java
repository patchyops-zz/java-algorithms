package io.patchyops.algorithms.sorting;

/**
 * Implements a standard Insertion Sort
 *
 * @author rat
 * @since 22 July 2017
 */
public class InsertionSort implements Sort {

    @Override
    public int[] sort (int[] input) {

        if (input == null) { return null; }

        int i;
        int j;

        for (i = 1; i < input.length; i++) {

            j = i;

            while ((j > 0) && (input[j] < input[j - 1])) {

                input[j] = input[j] + input[j - 1];
                input[j - 1] = input[j] - input[j - 1];
                input[j] = input[j] - input[j - 1];

                j--;
            }
        }
        return input;
    }
}
