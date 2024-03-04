package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
   public void testIntegerSort() {
        Integer[] input = {-10, 0, 20, 1, 22, 11, -90};
        Integer[] expected = {-90, -10, 0, 1, 11, 20, 22};
        BubbleSort<Integer> intBubbleSort = new BubbleSort<>();
        intBubbleSort.bubbleSort(input);
        assertArrayEquals(expected, input);
    }
    @Test
    public void testStringSort() {
        String[] input = {"one", "two", "three", "four", "five"};
        String[] expected = {"five", "four", "one", "three", "two"};
        BubbleSort<String> intBubbleSort = new BubbleSort<>();
        intBubbleSort.bubbleSort(input);
        assertArrayEquals(expected, input);
    }
}
