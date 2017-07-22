package io.patchyops.algorithms.sorting;

import io.patchyops.algorithms.test.util.SortUtil;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Unit tests for Insertion Sort
 *
 * @author rat
 * @since 22 July 2017
 */
public class InsertionSortTest {

    private InsertionSort insertionSort;
    private int[] input;
    private int[] output;
    private int[] sorted;

    @Before
    public void setInsertionSort() {
        insertionSort = new InsertionSort();
    }

    @Test
    public void testNullInput() {
        input = null;
        sorted = null;
        output = insertionSort.sort(input);
        assertEquals(output, sorted);
    }

    @Test
    public void testZeroElements() {
        input = new int[0];
        sorted = new int[0];
        output = insertionSort.sort(input);
        assertArrayEquals(output, sorted);
    }

    @Test
    public void testRandomInputFiveElements() {
        input = SortUtil.getRandomArray(5);
        sorted = SortUtil.getSortedArray(input);
        output = insertionSort.sort(Arrays.copyOf(input, input.length));
        assertArrayEquals(output, sorted);
    }

    @Test
    public void testRandomInput5000Elements() {
        input = SortUtil.getRandomArray(5000);
        sorted = SortUtil.getSortedArray(input);
        output = insertionSort.sort(Arrays.copyOf(input, input.length));
        assertArrayEquals(output, sorted);
    }

    @Test
    public void testAlreadySortedInput() {
        input = SortUtil.getRandomArray(5);
        sorted = SortUtil.getSortedArray(input);
        output = insertionSort.sort(sorted);
        assertArrayEquals(output, sorted);
    }

    @Test
    public void testReverseSortedInput() {
        input = SortUtil.getRandomArray(5);
        sorted = SortUtil.getReverseSortedArray(input);
        output = insertionSort.sort(sorted);
        assertArrayEquals(output, sorted);
    }
}