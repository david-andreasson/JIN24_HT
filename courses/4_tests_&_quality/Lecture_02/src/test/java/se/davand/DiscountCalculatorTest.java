package se.davand;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {

    @ParameterizedTest
    @CsvSource ({"1000, VIP, 800", "1000, Regular, 900", "1000, Guest, 1000"})
    void calculateDiscount(double price, String customerType, double expected) {
        assertEquals(expected, DiscountCalculator.calculateDiscount(price, customerType));
    }
}