package sorting_algos.selection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sorting_algos.SortingAlgo;

class SelectionSortTest {

    SortingAlgo testClass;

    @BeforeEach
    void setUp() {
        testClass = new SelectionSort();
    }

    @Test
    void sort() {
        Integer[] integers = new Integer[]{9, 45, -5, 4, 34, 2, -10};
        Integer[] res = testClass.sort(integers);
        Assertions.assertArrayEquals(new Integer[]{-10, -5, 2, 4, 9, 34, 45}, res);
    }
}