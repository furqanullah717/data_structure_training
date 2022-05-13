package sorting_algos.merge;

import sorting_algos.SortingAlgo;

public class MergeSort implements SortingAlgo {

    @Override
    public Integer[] sort(Integer[] integers) {

        mergeSort(integers, 0, integers.length);
        return integers;
    }

    public void mergeSort(Integer[] items, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(items, start, mid);
        mergeSort(items, mid, end);
        merge(items, start, mid, end);

    }

    void merge(Integer[] items, int start, int mid, int end) {
        if (items[mid - 1] <= items[mid])
            return;

        int i = start;
        int j = mid;
        int tempIndex = 0;
        Integer[] temp = new Integer[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = items[i] <= items[j] ? items[i++] : items[j++];
        }
        System.arraycopy(items, i, items, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, items, start, tempIndex);
    }
}
