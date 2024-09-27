package com.corndel.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathsTest {


    @Test
    public void PI_hasCorrectValue() {
        assertEquals(Maths.PI, 3.14);
    }

    @Test
    public void max_SmallLarge_ReturnsLargest(){
        assertEquals(Maths.max(2,4), 4);
    }

    @Test
    public void max_LargeSmall_ReturnsLargest(){
        assertEquals(Maths.max(4, 2), 4);
    }

    @Test
    public void max_Same_ReturnsLargest(){
        assertEquals(Maths.max(2, 2), 2);
    }

    @Test
    public void max_Negative_ReturnsLargest(){
        assertEquals(Maths.max(-4, -2), -2);
    }

    @Test
    public void round_Integer_ReturnsInteger(){
        assertEquals(Maths.round(45), 45);
    }

    @Test
    public void round_RoundsDown_ReturnsRounded(){
        assertEquals(Maths.round(.4), 0);
    }

    @Test
    public void round_RoundsUp_ReturnsRounded(){
        assertEquals(Maths.round(.6), 1);
    }

    @Test
    public void round_RoundsUpIfMiddle_ReturnsRounded(){
        assertEquals(Maths.round(1.5), 2);
    }
}
