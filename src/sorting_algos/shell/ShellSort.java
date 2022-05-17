package sorting_algos.shell;

import base.SortingAlgo;

public class ShellSort implements SortingAlgo {
    @Override
    public Integer[] sort(Integer[] integers) {

        for (int gap = integers.length / 2; gap > 0; gap  /= 2) {
            for (int index = gap; index < integers.length; index++) {
                int newElement = integers[index];

                int j = index;
                while (j >= gap && integers[j - gap] > newElement) {
                    integers[j] = integers[j - gap];
                    j-=gap;
                }
                integers[j] = newElement;
            }
        }
        return integers;
    }
}
