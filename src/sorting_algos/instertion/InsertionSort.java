package sorting_algos.instertion;

import sorting_algos.SortingAlgo;

public class InsertionSort implements SortingAlgo {
    @Override
    public Integer[] sort(Integer[] integers) {

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < integers.length; firstUnsortedIndex++) {

            int newElement = integers[firstUnsortedIndex];
            int index;
            for (index = firstUnsortedIndex; index > 0 && integers[index-1] > newElement; index--) {
                integers[index] = integers[index - 1];
            }
            integers[index] = newElement;
        }

        return integers;
    }
}
