package sorting_algos.merge;

import base.BaseTestClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeSortTest extends BaseTestClass {

    @Override
    public void initClass() {
        testClass = new MergeSort();
    }

    @Test
    public void descendingOrderTest() {
        Integer[] requested = new Integer[]{9, 45, -5, 4, 34, 2, -10};
        Integer[] expected = new Integer[]{45, 34, 9, 4, 2, -5, -10};
        Assertions.assertArrayEquals(expected,testClass.sort(requested,true) );
    }
}