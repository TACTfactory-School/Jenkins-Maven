package com.tactfactory.app;

public class Calculator {

    public int add(int a, int b) {
        int result = a + b;

        return result;
    }

    public int sup(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return 0;
    }

    public int div(int a, int b) throws DivByZeroException {
        int result;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            throw new DivByZeroException();
        }

        return result;
    }

}
