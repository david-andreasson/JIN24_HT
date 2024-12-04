package se.davand;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
        Calculator calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        Object calculator = null;
    }

    @Test
    void add() {
        assertEquals(3, Calculator.add(1, 2));
    }

    @Test
    void subtract() {
        assertEquals(-1, Calculator.subtract(1, 2));
    }

    @Test
    void multiply() {
        assertEquals(12, Calculator.multiply(3, 4));
    }

    @Test
    void divide() {
        assertEquals(4, Calculator.divide(8, 2));
    }
}