package sorting_algos.quick;

import base.BaseTestClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QuickSortTest extends BaseTestClass {

    @Override
    public void initClass() {
        testClass = new QuickSort();
    }

    @Test
    void sort2() {
        Integer[] integers = new Integer[]{3, -1, 7, -20, 2, 55};
        Integer[] res = testClass.sort(integers,false);
        Assertions.assertArrayEquals(new Integer[]{-20, -1, 2, 3, 7, 55}, res);
    }
}