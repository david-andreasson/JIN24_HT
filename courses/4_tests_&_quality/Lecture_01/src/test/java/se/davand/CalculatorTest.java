package se.davand;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
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

    @ParameterizedTest
    @CsvSource({
            "1,2,3",
            "2,2,4",
            "-3,2,-1"
    })
    void ParameterizedAdd(int a, int b, int expected) {
        assertEquals(expected, Calculator.add(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "1,2,-1",
            "2,2,0",
            "4,8,-4"
    })
    void ParameterizedSubtract(int a, int b, int expected) {
        assertEquals(expected, Calculator.subtract(a, b));
    }

}
