package oop.overloading;

public class MathHelper {


    //metoda o sygnaturze addNumbers(int, int)
    public float addNumbers(int a, int b){
        return a + b;
    }

    //metoda o sygnaturze addNumbers(float, float)
    public float addNumbers(float a, float b){
        return a + b;
    }

    //metoda o sygnaturze addNumbers(double, double)
    public double addNumbers(double a, double b){
        return a + b;
    }

    //wszystkie 3 metody maja rozne sygnatury, wiec mozemy je przeciazac
    //UWAGA !! TYP ZWRACANY nie nalezy do definicji sygnatury
}
