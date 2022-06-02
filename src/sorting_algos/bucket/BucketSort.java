package sorting_algos.bucket;

import base.SortingAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort implements SortingAlgo {
    @Override
    public Integer[] sort(Integer[] integers, boolean descending) {

        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        for (int i = 0; i < integers.length; i++) {
            buckets[hash(integers[i])].add(integers[i]);
        }
        for (int i = 0; i < integers.length; i++) {
            Collections.sort(buckets[i]);
        }
        int index = 0;
        for(int i = 0 ;i<integers.length;i++){
            for(Integer value : buckets[i]){
                integers[index++] = value;
            }
        }

        return integers;
    }

    private int hash(Integer integer) {
        int result =  integer/10;
        return integer / 10;
    }

}
