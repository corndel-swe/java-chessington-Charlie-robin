package com.corndel.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getArea() {
        // ARRANGE -> CREATE AN INSTANCE OF THE OBJECT
        // - USE A CONSTRUCTOR & GIVE IT ITS VALUES
        Shape rectangle = new Rectangle(5, 10);
        // ACT -> TEST THAT INSTANCE METHOD
        double result = rectangle.getArea();
        assertEquals(result, 50);

        Double d = Double.valueOf(2);

        assertEquals(2d, d);
    }

    @Test
    void getPerimeter() {
        Shape rectangle = new Rectangle(5, 10);
        double result = rectangle.getPerimeter();
        assertEquals(result, 30);
    }
}