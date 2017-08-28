package oop.excepions;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

/**
 * Created by RENT on 2017-07-25.
 */
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[]{10, 20, 30, 40, 50};

        System.out.println("Podaj element ktory chcesz wyswietlic");

        int wynik = 0;
        String str = null;

        try {
            int numer = sc.nextInt();
            System.out.println("1. ZAMIERZAM WYKONAC POTENCJALNIE NIEBEZPIECZNY KOD");
            wynik = arr[numer];
            System.out.println("2. Udalo sie wykonac ten kod");
            System.out.println(str.length());

        } catch (InputMismatchException ex) {
            System.out.println("Zle dane wejsciowe");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("WYJATEK");
            System.out.println(ex.getMessage());
        } catch (NullPointerException ex) {
            System.out.println("Element nie moze byc null");
        } catch (Exception ex) {

        }


        System.out.println("Twoj element to: " + wynik);

        System.out.println("KONIEC PROGRAMU");
    }
}
