package day09;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ShapeTest {

    @Test
    void circleAreaThroughShapeReference() {
        Shape s = new Circle(2.0);
        assertEquals(Math.PI * 4.0, s.area(), 1e-9,
                "A Circle's area is pi * r^2, computed via the overridden area()");
    }

    @Test
    void rectangleArea() {
        Shape s = new Rectangle(2.0, 3.0);
        assertEquals(6.0, s.area(), 1e-9, "A 2x3 rectangle has area 6.0");
    }

    @Test
    void triangleArea() {
        Shape s = new Triangle(4.0, 3.0);
        assertEquals(6.0, s.area(), 1e-9, "A triangle with base 4 and height 3 has area 0.5 * 4 * 3 = 6.0");
    }

    @Test
    void totalAreaSumsAMixedArray() {
        Shape[] shapes = {new Rectangle(2.0, 3.0), new Triangle(4.0, 3.0), new Circle(1.0)};
        double expected = 6.0 + 6.0 + Math.PI;
        assertEquals(expected, ShapeUtils.totalArea(shapes), 1e-9,
                "totalArea should add up each shape's own area(), whatever its concrete type");
    }
}
