package org.example;

import junit.framework.TestCase;
import Mockito;


/**
 * Unit test for Calculator
 */
public class CalculatorAppTest extends TestCase
{
    Calculator calc = new Calculator();

    public void testSum() {
        Double res = calc.sum(1.0, 0.0);

        assertEquals(1.0, res);
    }

    public void testSub() {
        Double res = calc.sub(5.0, 1.0);

        assertEquals(4.0, res);
    }


    public void testDiv() {
        Double res = calc.div(5.0, 2.0);
        assertEquals(2.5, res);
    }

    public void testDivZero() {
        boolean exceptionThrown = false;

        try {
            calc.div(5.0, 0.0);
        } catch (ArithmeticException e) {
            exceptionThrown = true;
        }

        assertTrue( exceptionThrown);
    }

    public void testMulti() {
        Double res = calc.multi(1.0, 0.0);

        assertEquals(0.0, res);
    }
}
