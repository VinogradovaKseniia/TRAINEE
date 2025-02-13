package org.example;

public class Factorial {

    public int getFactorial(int f) {
        if (f < 0) {
            throw new ArithmeticException("It's not possible to get factorial from negative value.");
        }
        if (f >= 13) {
            throw new ArithmeticException("Too large value to get factorial from.");
        }
        int result = 1;
        if (f == 0 || f == 1) {
            return result;
        } else {
            for (int i = 1; i <= f; i++) {
                result = result * i;
            }
            return result;
        }
    }
}
