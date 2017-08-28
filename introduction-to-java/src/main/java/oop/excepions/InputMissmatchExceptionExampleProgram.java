package oop.excepions;

import oop.abstractExample.Figura;
import oop.abstractExample.Kwadrat;
import oop.abstractExample.Prostokat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissmatchExceptionExampleProgram {
    public static int ReadFromScanner() {
        Scanner sc = new Scanner(System.in);
        int wybor = -1;
        try {
            wybor = sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
        }
        return wybor;
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        boolean czyWyjsc = false;

        Figura[] figury = new Figura[10];
        int liczbaFigur = 0;


        while (czyWyjsc == false) {
            System.out.println("1.Dodawanie kwadratu");
            System.out.println("2.Dodawanie prostokata");
            System.out.println("3.Oblicz wszystkie pola");

            int wybor = ReadFromScanner();
            Figura jakasFigura = null;

            switch (wybor) {
                case 1: {
                    System.out.println("Podaj bok kwadratu");
                    int bok = scanner.nextInt();
                    jakasFigura = new Kwadrat(bok);
                    figury[liczbaFigur] = jakasFigura;
                    liczbaFigur++;
                    break;
                }
                case 2: {
                    System.out.println("Podaj boki prostokata");
                    int bokPierwszy = scanner.nextInt();
                    int bokDrugi = scanner.nextInt();
                    jakasFigura = new Prostokat(bokPierwszy, bokDrugi);
                    figury[liczbaFigur] = jakasFigura;
                    liczbaFigur++;

//                    figury[liczbaFigur++] = new Prostokat(bokPierwszy, bokPierwszy);
                    break;
                }
                case 3: {
                    System.out.println("Pola figur to: ");
                    for (int i = 0; i < liczbaFigur; i++) {
                        Figura figuraZTablicy = figury[i];
                        double pole = figuraZTablicy.ObliczPole();
                        System.out.println("Licze pole dla: ");
                        figuraZTablicy.Opisz();
                        System.out.println("Pole to :" + pole);
                    }
                    break;
                }
                case 0: {
                    System.out.println("Wychodze z programu");
                    czyWyjsc = true;
                    break;
                }
                default: {
                    System.out.println("Wyswietl menu od nowa");
                }
            }
        }
    }

}

