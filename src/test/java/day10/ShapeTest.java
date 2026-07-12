package day10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;

class ShapeTest {

    @Test
    void shapeIsDeclaredAbstract() {
        assertTrue(Modifier.isAbstract(Shape.class.getModifiers()),
                "Shape must be declared abstract so nobody can create a meaningless plain shape");
        assertEquals(Math.PI, new Circle(1.0).area(), 1e-9,
                "Every concrete subclass must supply its own area() — that's the contract abstract enforces");
    }

    @Test
    void polymorphicAreaThroughShapeReference() {
        Shape circle = new Circle(2.0);
        Shape rect = new Rectangle(2.0, 3.0);
        assertEquals(Math.PI * 4.0, circle.area(), 1e-9, "Circle area is pi * r^2");
        assertEquals(6.0, rect.area(), 1e-9, "Rectangle area is width * height");
    }

    @Test
    void describeUsesClassNameAndArea() {
        Shape rect = new Rectangle(2.0, 3.0);
        assertEquals("Rectangle with area 6.0", rect.describe(),
                "describe() combines the simple class name with the computed area");
    }
}
