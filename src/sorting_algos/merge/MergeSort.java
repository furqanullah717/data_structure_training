package sorting_algos.merge;

import sorting_algos.SortingAlgo;

public class MergeSort implements SortingAlgo {

    @Override
    public Integer[] sort(Integer[] integers) {

        mergeSort(integers);
        return integers;
    }

    public void mergeSort(Integer[] items) {
        if (items.length < 2) {
            return;
        }
        //identify then mid
        int mid = items.length / 2;

        //create 2 temp arrays for left side and right side
        Integer[] leftSide = new Integer[mid];
        Integer[] rightSide = new Integer[items.length - mid];

        //fil data inside the temp arrays
        for (int i = 0; i < mid; i++) {
            leftSide[i] = items[i];
        }
        for (int i = mid; i < items.length; i++) {
            rightSide[i - mid] = items[i];
        }

        //divide left side
        mergeSort(leftSide);
        //divide right side
        mergeSort(rightSide);
        //merge
        merge(items, leftSide, rightSide);

    }

    void merge(Integer[] items, Integer[] left, Integer[] right) {
        int i = 0;
        int j = 0;
        int tempIndex = 0;
        while (i < left.length && j < right.length) {
            items[tempIndex++] = left[i] <= right[j] ? left[i++] : right[j++];
        }
        while (i < left.length) {
            items[tempIndex++] = left[i++];
        }
        while (j < right.length) {
            items[tempIndex++] = right[j++];
        }
    }
}
