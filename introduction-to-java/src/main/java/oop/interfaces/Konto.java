package oop.interfaces;

public interface Konto {
    void Wplata(double kwota);
    double Wyplata(double kwota) throws Exception;
    double getBilans();

}
