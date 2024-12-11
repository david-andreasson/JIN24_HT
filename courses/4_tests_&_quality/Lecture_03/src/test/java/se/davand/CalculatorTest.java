package se.davand;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.add(4, 4));
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.subtract(8, 4));
    }

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(16, calculator.multiply(4, 4));
    }

    @Test
    void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(8, 4));
    }
}
