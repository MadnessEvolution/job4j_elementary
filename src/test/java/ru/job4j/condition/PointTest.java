package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    @Test
    public void whenDistance2D() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        double result = a.distance(b);
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void whenDistance2DSamePoint() {
        Point a = new Point(2, 2);
        Point b = new Point(2, 2);
        double result = a.distance(b);
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    public void whenDistance3D() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 6, 3);
        double result = a.distance3d(b);
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void whenDistance3DFull() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 2, 2);
        double result = a.distance3d(b);
        assertEquals(3.0, result, 0.0001);
    }
}