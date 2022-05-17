package sorting_algos.bubble;

import base.SortingAlgo;

public class BubbleSort implements SortingAlgo {

    @Override
    public Integer[] sort(Integer[] integers,boolean descending) {
        for (int i = 0; i < integers.length; i++) {
            for (int j = i; j < integers.length; j++) {
                if (integers[i] > integers[j]) {
                    int temp = integers[i];
                    integers[i] = integers[j];
                    integers[j] = temp;
                }
            }

        }
        return integers;
    }
}
