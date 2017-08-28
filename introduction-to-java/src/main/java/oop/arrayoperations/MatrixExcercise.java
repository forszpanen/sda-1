package oop.arrayoperations;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-18.
 */
public class MatrixExcercise {
    public void start(){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        //INICJALIZACJA PIERWSZEJ MACIERZY
        Matrix macierz1 = new Matrix(m,n);

        macierz1.initializeMatrix();
        macierz1.printMatrix();


        //Inicjalizacja drugiej macierzy
        Matrix macierz2 = new Matrix(4,4);

        macierz2.initializeMatrix();
        macierz2.printMatrix();

        //DODAWANIE MACIERZY
        System.out.println("DODAWANIE");
        Matrix wynik = macierz1.addMatrix(macierz2);
        wynik.printMatrix();

        System.out.println("Odejmowanie");
        Matrix wynikOdejmowania = macierz1.addMatrix(macierz2);
        wynikOdejmowania.printMatrix();
    }
}
