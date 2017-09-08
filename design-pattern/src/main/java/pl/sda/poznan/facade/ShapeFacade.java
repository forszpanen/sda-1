package pl.sda.poznan.facade;

public class ShapeFacade {
    private Shape circle;
    private Shape rectangle;
    private Shape sqaure;


    public ShapeFacade() {
        circle = new Circle();
        rectangle = new Rectangle();
        sqaure = new Square();
    }

    public void drawAll() {
        circle.draw();
        rectangle.draw();
        sqaure.draw();
    }
}
