package oop.interfaces;

public class KontoOszczednosciowe implements Konto {

    private double bilans;

    public KontoOszczednosciowe() {
    }

    public KontoOszczednosciowe(double bilans) {
        this.bilans = bilans;
    }

    //IllegalArgumentException rozszerza RuntimeException -> jest to wyjatek
    //typu unchecked -> wypisanie go w klauzuli throws nie jest obowiazkowe
    @Override
    public void Wplata(double kwota) {
        if (kwota < 0) {
            throw new IllegalArgumentException("Wplacana kwota nie moze byc ujemna");
        }
        bilans += kwota;
    }

    //Rzucamy wyjatek typu exception
    //kazdy wyjatek dziedziczacy po exception jest typu checked
    // zatem nalezy dodac informacje o rzucanym wyjatku
    //w klauzuli throws
    @Override
    public double Wyplata(double kwota) throws Exception {
        if (kwota > bilans) {
            throw new Exception("Zbyt malo srodkow na koncie");
        }
        bilans -= kwota;
        return kwota;
    }

    @Override
    public double getBilans() {
        return bilans;
    }

    protected void setBilans(double bilans){
        this.bilans = bilans;
    }
}
