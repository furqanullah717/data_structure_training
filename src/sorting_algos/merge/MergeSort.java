package sorting_algos.merge;

import base.SortingAlgo;

public class MergeSort implements SortingAlgo {

    @Override
    public Integer[] sort(Integer[] integers, boolean descending) {

        mergeSort(integers, descending);
        return integers;
    }

    public void mergeSort(Integer[] items, boolean descending) {
        if (items.length < 2) {
            return;
        }
        //identify then mid
        int mid = items.length / 2;

        //create 2 temp arrays for left side and right side
        Integer[] leftSide = new Integer[mid];
        Integer[] rightSide = new Integer[items.length - mid];

        //fil data inside the temp arrays
        System.arraycopy(items, 0, leftSide, 0, mid);
        if (items.length - mid >= 0) System.arraycopy(items, mid, rightSide, mid - mid, items.length - mid);
        //divide left side
        mergeSort(leftSide, descending);
        //divide right side
        mergeSort(rightSide, descending);
        //merge
        merge(items, leftSide, rightSide, descending);

    }

    void merge(Integer[] items, Integer[] left, Integer[] right, boolean descending) {
        int i = 0;
        int j = 0;
        int tempIndex = 0;
        while (descending ? j < left.length && i < right.length : i < left.length && j < right.length) {

            if (descending) {
                items[tempIndex++] = left[j] >= right[i] ? left[j++] : right[i++];
            } else {
                items[tempIndex++] = left[i] <= right[j] ? left[i++] : right[j++];
            }

        }
        if(descending) {
            assignRemaining(items, left, tempIndex, j);
            assignRemaining(items, right, tempIndex, i);
        }else {
            assignRemaining(items, left, tempIndex, i);
            assignRemaining(items, right, tempIndex, j);
        }
    }

    private void assignRemaining(Integer[] integers, Integer[] tempArray, Integer tempIndex, Integer arrIndex) {
        while (arrIndex < tempArray.length) {
            integers[tempIndex++] = tempArray[arrIndex++];
        }
    }
}
