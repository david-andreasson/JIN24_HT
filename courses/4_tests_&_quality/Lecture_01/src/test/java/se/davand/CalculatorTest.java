package se.davand;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
        System.out.println("Test started");
    }

    @AfterEach
    void tearDown() {
        calc = null;
        System.out.println("Test finished");
    }

    @Test
    void testAddition() {
        assertEquals(5, calc.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    void testDivision() {
        assertEquals(2, calc.divide(6, 3), "6 / 3 should equal 2");
    }

    @Test
    void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(1, 0),
                "Dividing by zero should throw IllegalArgumentException");
    }
}