package oop.interfaces;

/**
 * Created by RENT on 2017-07-25.
 */
public class ProgramKonto {
    public static void main(String[] args) {
        KontoOszczednosciowe mojeKonto = new KontoOszczednosciowe(200);

        try {
            mojeKonto.Wyplata(500);
        } catch (Exception e) {
            System.out.println("Wystapil blad: " + e.getMessage());
        }
        System.out.println("Test");


        MaleKonto mojeMaleKonto = new MaleKonto(200, 500);
        try {
            mojeMaleKonto.Wyplata(300);
        } catch (Exception e) {
            System.out.println("Wystapil blad: " + e.getMessage());

        }
    }
}
