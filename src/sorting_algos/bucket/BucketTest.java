package sorting_algos.bucket;

import base.BaseTestClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BucketTest extends BaseTestClass {

    @Override
    public void initClass() {
        testClass = new BucketSort();
    }

    protected Integer[] test = new Integer[]{9, 45, 5, 4, 34, 2, 10};
    protected Integer[] expcted = new Integer[]{2, 4, 5, 9, 10, 34, 45};

    @Test
    @Override
    public void sort() {
        Integer[] res = testClass.sort(test, false);
        Assertions.assertArrayEquals(expcted, res);
    }
}