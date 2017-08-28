package oop;

//Stara wersja klasy pracownik - zawiera pola publiczne - przyklad zastosowania
public class Pracownik {

    //Deklaracja pola publicznego w klasie
    //Mozliwy dostep z zewnatrz
    public String imie;

    public String nazwisko;

    public int wiek;

    private float pensja;


    public Pracownik(){
        pensja = 2000;
    }

    public void Podwyzka(int percent){
        float kwota = pensja * percent/100;
        pensja += kwota;
    }

    public void WypiszPensje(){
        System.out.println("Pensja to: " + pensja);
    }


    //metoda klasy Pracownik
    public void Opis(){
        System.out.println("Imie: " + this.imie);
    }

    public void OpiszPracownika(){
        System.out.println("Imie: " + this.imie + " Nazwisko:" + this.nazwisko);
    }

}
