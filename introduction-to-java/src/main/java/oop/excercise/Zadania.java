package oop.excercise;

import oop.mathematic.Circle;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-14.
 */
public class Zadania {

    //Zadanie 2 - strona 6 - obliczanie pola i obwodu kola
    public void Zad2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promien");
        double promien = scanner.nextDouble();
        Circle circle = new Circle();
        circle.setRadius(promien);

        System.out.println("Promien to:" + circle.getRadius());

        System.out.println(circle.Area());
        System.out.println(circle.Circumference());
    }

//Firma i pracownicy
    public void Zad3(){

    }
}
