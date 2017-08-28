package oop.inheritance;


import java.util.Scanner;

public class Student extends Osoba {
    private int index;
    private String kierunek;
    private String uczelnia;
    public static int liczbaStudentow = 0;

    public Student(){
        liczbaStudentow++;
    }

    public Student(String imie, String nazwisko, int wiek){
        super(imie, nazwisko, wiek);
    }

    public Student(String imie, String nazwisko, int wiek, int index, String kierunek, String uczelnia){
        super(imie, nazwisko, wiek);
        this.index = index;
        this.kierunek = kierunek;
        this.uczelnia = uczelnia;

    }

    public void OpiszStudenta(){
        this.OpiszOsobe();
        System.out.println("Dodatkowo jestem studentem i studiuje:" + kierunek);
    }





}
