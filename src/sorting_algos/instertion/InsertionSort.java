package sorting_algos.instertion;

import base.SortingAlgo;

public class InsertionSort implements SortingAlgo {
    @Override
    public Integer[] sort(Integer[] integers) {

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < integers.length; firstUnsortedIndex++) {

            int newElement = integers[firstUnsortedIndex];
            int index;
            //if index is greater than 0 and the element on left is greater, then run the loop
            for (index = firstUnsortedIndex; index > 0 && integers[index-1] > newElement; index--) {
                integers[index] = integers[index - 1];
            }
            integers[index] = newElement;
        }

        return integers;
    }
}
