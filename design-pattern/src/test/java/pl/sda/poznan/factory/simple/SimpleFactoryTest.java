package pl.sda.poznan.factory.simple;

import org.junit.Test;
import pl.sda.poznan.factory.Shape;

import static org.junit.Assert.assertEquals;

public class SimpleFactoryTest {
    @Test
    public void getShape() throws Exception {
    }

    @Test
    public void getShape1() throws Exception {
        SimpleFactory simpleFactory = new SimpleFactory();

        Shape shape = simpleFactory.getShape(ShapeType.CIRCLE);
        double circumference = shape.circumference();
        assertEquals(circumference, 0, 1);
    }

}