package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxTest {

    @Test
    public void whenMaxTwoNumbers() {
        assertEquals(10, Max.max(10, 5));
        assertEquals(7, Max.max(3, 7));
        assertEquals(5, Max.max(5, 5));
    }

    @Test
    public void whenMaxThreeNumbers() {
        assertEquals(9, Max.max(4, 9, 7));
        assertEquals(5, Max.max(5, 5, 5));
    }

    @Test
    public void whenMaxFourNumbers() {
        assertEquals(100, Max.max(20, 50, 100, 99));
        assertEquals(42, Max.max(42, 42, 42, 42));
    }
}