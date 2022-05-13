package recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    Factorial testClass = new Factorial();

    @Test
    void checkFactorial() {
        Assertions.assertEquals(120, testClass.getFactorial(5));
    }
}