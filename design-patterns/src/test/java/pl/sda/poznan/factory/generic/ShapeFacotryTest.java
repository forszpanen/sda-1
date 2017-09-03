package pl.sda.poznan.factory.generic;

import org.junit.Test;
import pl.sda.poznan.factory.Shape;
import pl.sda.poznan.factory.simple.ShapeType;

import static org.junit.Assert.*;

public class ShapeFacotryTest {
    @Test
    public void create() throws Exception {
        ShapeFacotry sf = new ShapeFacotry();

        Shape shape = sf.create(ShapeType.RECTANGLE);
        System.out.println(sf.toString());
    }

}