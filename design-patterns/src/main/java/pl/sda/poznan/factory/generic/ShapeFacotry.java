package pl.sda.poznan.factory.generic;

import pl.sda.poznan.factory.Circle;
import pl.sda.poznan.factory.Rectangle;
import pl.sda.poznan.factory.Shape;
import pl.sda.poznan.factory.Square;
import pl.sda.poznan.factory.simple.ShapeType;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ShapeFacotry implements Factory<ShapeType, Shape> {

    private Map<ShapeType, Supplier<Shape>> map = new EnumMap<>(ShapeType.class);

    public ShapeFacotry() {
        map.put(ShapeType.CIRCLE, Circle::new);
        map.put(ShapeType.RECTANGLE, Rectangle::new);
        map.put(ShapeType.SQUARE, Square::new);
    }

    @Override
    public Shape create(ShapeType key) {
        Supplier<Shape> shapeSupplier = map.get(key);
        Shape shape = shapeSupplier.get();

        return map.containsKey(key) ? map.get(key).get() : null;
    }
}
