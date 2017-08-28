package oop.abstractExample;

public class Prostokat extends Figura {

    private double a;
    private double b;

    public Prostokat() {
    }

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }


    @Override
    public double ObliczPole() {
        return a * b;
    }

    @Override
    public double ObliczObwod() {
        return 2 * a + 2 * b;
    }

    @Override
    public void Opisz(){
        System.out.println("Jestem prostokatem");
    }
}
