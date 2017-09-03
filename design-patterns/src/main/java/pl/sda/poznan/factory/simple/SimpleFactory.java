package pl.sda.poznan.factory.simple;

import pl.sda.poznan.factory.Circle;
import pl.sda.poznan.factory.Rectangle;
import pl.sda.poznan.factory.Shape;

public class SimpleFactory {
    public Shape getShape(String name){
        if(name.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(name.equalsIgnoreCase("RECTAGLE")){
            return new Rectangle();
        }else if(name.equalsIgnoreCase("SQUARE")){
            return new Circle();
        }
        return null;
    }

    public Shape getShape(ShapeType shapeType){
        if(shapeType == ShapeType.CIRCLE){
            return new Circle();
        }else if(shapeType == ShapeType.RECTANGLE){
            return new Rectangle();
        }else if(shapeType == ShapeType.SQUARE){
            return new Circle();
        }
        return null;
    }
}
