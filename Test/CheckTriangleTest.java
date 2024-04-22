package Test;

import org.junit.Test;

import Source.CheckTriangle;

import static org.junit.Assert.assertEquals;

public class CheckTriangleTest {
    @Test
    public void testEquilateralTriangle() {
        assertEquals("Equilateral", CheckTriangle.CheckTriangleFunction(5, 5, 5));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("Isosceles", CheckTriangle.CheckTriangleFunction(5, 5, 7));
    }

    @Test
    public void testScaleneTriangle() {
        assertEquals("Scalene", CheckTriangle.CheckTriangleFunction(3, 4, 6));
    }

    @Test
    public void testRightTriangle() {
        assertEquals("RightTriangle", CheckTriangle.CheckTriangleFunction(3, 4, 5));
    }

    @Test
    public void testNotATriangle() {
        assertEquals("NotATriangle", CheckTriangle.CheckTriangleFunction(0, 0, 0));
    }
}
