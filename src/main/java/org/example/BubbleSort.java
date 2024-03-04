package org.example;

public class BubbleSort<T extends Comparable<T>> {

    public void bubbleSort(T[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j].compareTo(array[j+1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {-10, 0, 20, 1, 22, 11, -90};
        BubbleSort<Integer> intBubbleSort = new BubbleSort<>();
        intBubbleSort.bubbleSort(intArray);

        for (Integer num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        String[] strArray = {"one", "two", "three", "four", "five"};
        BubbleSort<String> strBubbleSort = new BubbleSort<>();
        strBubbleSort.bubbleSort(strArray);

        for (String str : strArray) {
            System.out.print(str + " ");
        }
        System.out.println();
    }


}
