package oop.mathematic;

public class Circle {
    private double radius;

    public Circle() {
        radius = 0;
    }

    public double getRadius() {
        return this.radius;
    }


    public void setRadius(double r) {
        if (r < 0) {
            System.out.println("Promien nie moze byc ujemny");
        } else {
            this.radius = r;
        }
    }

    public double Area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double Circumference() {
        return 2 * Math.PI * radius;
    }
}
