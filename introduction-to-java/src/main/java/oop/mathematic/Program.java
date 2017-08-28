package oop.mathematic;

import java.util.Scanner;

/**
 * Created by RENT on 2017-07-20.
 */
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pierwszyWspolczynnik = scanner.nextDouble();
        double drugiWspolczynnik = scanner.nextDouble();
        double trzeciWspolczynnik = scanner.nextDouble();

        BinomialSolver bs = new BinomialSolver(pierwszyWspolczynnik, drugiWspolczynnik, trzeciWspolczynnik);
        bs.count();

        double x1 = bs.getX1();
        double x2 = bs.getX2();

        System.out.println("Podaj wartosc x:");
        double x = scanner.nextDouble();


        System.out.println(bs.calculate(x));

    }
}
