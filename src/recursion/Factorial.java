package recursion;

public class Factorial {

    public int getFactorial(int num) {
        if (num == 0)
            return 1;
        return num * getFactorial(--num);
    }
}
