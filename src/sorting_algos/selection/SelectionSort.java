package sorting_algos.selection;

import sorting_algos.SortingAlgo;

public class SelectionSort implements SortingAlgo {

    @Override
    public Integer[] sort(Integer[] integers) {

        for (int lastUnsortedIndex = integers.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int index = 0;
            for (int j = 0; j <= lastUnsortedIndex; j++) {
                if (index == j) continue;
                if (integers[j] > integers[index]) {
                    index = j;
                }
            }
            int temp = integers[index];
            integers[index] = integers[lastUnsortedIndex];
            integers[lastUnsortedIndex] = temp;
        }
        return integers;
    }
}
