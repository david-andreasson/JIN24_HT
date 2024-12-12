package se.davand.exercises_02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class exercise_2Test {

    @Test

    void doesPriceOver1000GiveDiscount() {

        assertEquals(900, exercise_2.customerType(1000, "Regular"));
    }

}