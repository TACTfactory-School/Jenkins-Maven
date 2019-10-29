package com.tactfactory.app;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

    Calculator calc;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        this.calc = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        this.calc = null;
    }

    @Test
    public void testAdd() {
        int a = 1;
        int b = 2;
        int expected = 3;

//        Calculator calc = new Calculator();
        int actual = calc.add(a, b);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testSup() {
        int a = 4;
        int b = 1;
        int expected = 3;

//        Calculator calc = new Calculator();
        int actual = calc.sup(a, b);

        Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void testDiv() throws DivByZeroException {
        int a = 4;
        int b = 2;
        int expected = 2;

//        Calculator calc = new Calculator();
        int actual = calc.div(a, b);

        Assert.assertEquals(expected, actual, 0);

    }

    @Test(expected = DivByZeroException.class)
    public void testDivByZero() throws DivByZeroException {
        int a = 4;
        int b = 0;

//        Calculator calc = new Calculator();
        int actual = calc.div(a, b);

        Assert.assertEquals(0, actual, 0);
    }

}
