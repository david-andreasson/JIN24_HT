package se.davand;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, -4, 0})
    void isPositive(int number) {
        assertTrue(NumberChecker.isPositive(number));
    }

    @ParameterizedTest
    @CsvSource ({"-1", "-2", "3", "4", "0"})
    void isPositiveCSV(int number) {
        assertTrue(NumberChecker.isPositive(number));
    }
}
