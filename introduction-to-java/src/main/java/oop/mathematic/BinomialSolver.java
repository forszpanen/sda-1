package oop.mathematic;

/**
 * Created by RENT on 2017-07-20.
 */
public class BinomialSolver {
    private double a;
    private double b;
    private double c;

    private double x1;
    private double x2;

    public BinomialSolver(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void count(){
        double delta = b*b - 4 * a *c;
        //jezeli delta > 0
        //jezeli delta == 0
        //jezeli delta < 0
        if(delta > 0){
            x1 = (-b - Math.sqrt(delta)) / 2*a;
            x2 = (-b + Math.sqrt(delta)) / 2*a;
            System.out.println("Pierwiastki to: " + x1 + " " + x2);
        }else if(delta == 0){
            x1 = -b / 2*a;
            System.out.println("Pierwiastek to: " + x1);
        }else{
            System.out.println("Rownanie nie ma pierwiastow rzeczywistych");
        }
    }

    public double calculate(double x){
        return a * x * x + b * x + c;
    }

    //napisac gettery

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }


    //napisac przeciazony konstruktor przyjmujacy 3 parametry
}
