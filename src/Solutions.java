import sorting_algos.BubbleSort;
import sorting_algos.SortingAlgo;

import java.util.Arrays;

public class Solutions {
    public static void main(String[] args) {
       //test class
        SortingAlgo algo = new BubbleSort();
        Integer[] integers = new Integer[]{9, 45, -5, 4, 34, 2, -10};
        System.out.println(Arrays.toString(algo.sort(integers)));
    }
}
