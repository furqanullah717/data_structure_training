package sorting_algos.quick;

import base.SortingAlgo;

public class QuickSort implements SortingAlgo {
    @Override
    public Integer[] sort(Integer[] integers) {
        quickSort(integers, 0, integers.length);
        return integers;
    }


    private void quickSort(Integer[] integers, int startIndex, int endIndex) {

        if(endIndex-startIndex<2)
            return;
        int pivotIndex = partitionedPivot(integers, startIndex, endIndex);
        quickSort(integers, startIndex, pivotIndex);
        quickSort(integers, pivotIndex + 1, endIndex);
    }

    private int partitionedPivot(Integer[] integers, int startIndex, int endIndex) {
        int i = startIndex;
        int j = endIndex;

        int pivot = integers[i];
        while (i < j) {

            // fetch the left index
            while (i < j && pivot < integers[--j]) ;

            if (i < j) {
                integers[i] = integers[j];
            }

            while (i < j && pivot >= integers[++i]) ;
            if (i < j) {
                integers[j] = integers[i];
            }
        }
        integers[j] = pivot;

        return j;
    }
}
