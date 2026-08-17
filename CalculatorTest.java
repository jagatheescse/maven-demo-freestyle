package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private final Calculator calc = new Calculator();

    @Test public void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test public void testSubtract() {
        assertEquals(1, calc.subtract(3, 2));
    }

    @Test public void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test public void testDivide() {
        assertEquals(2.5, calc.divide(5, 2), 0.01);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        calc.divide(5, 0);
    }
}