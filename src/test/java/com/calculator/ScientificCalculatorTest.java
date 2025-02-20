package com.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ScientificCalculatorTest {

    @Test
    void testSquareRoot() {
        assertEquals(4.0, ScientificCalculator.squareRoot(16), 0.0001);
    }

    @Test
    void testFactorial() {
        assertEquals(120, ScientificCalculator.factorial(5));
    }

    @Test
    void testNaturalLog() {
        assertEquals(0.0, ScientificCalculator.naturalLog(1), 0.0001);
    }

    @Test
    void testPower() {
        assertEquals(8.0, ScientificCalculator.power(2, 3), 0.0001);
    }
}
