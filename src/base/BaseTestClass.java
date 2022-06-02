package base;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public abstract class BaseTestClass {

    protected SortingAlgo testClass;

    @BeforeEach
    void setUp() {
        initClass();
    }

    public abstract void initClass();

    protected Integer[] requested = new Integer[]{9, 45, -5, 4, 34, 2, -10};
     protected Integer[] expected  =new Integer[]{-10, -5, 2, 4, 9, 34, 45};
    @Test
    public void sort() {
        Integer[] res = testClass.sort(requested,false);
        Assertions.assertArrayEquals(expected, res);
    }
}
