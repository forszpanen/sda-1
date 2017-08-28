package oop.inheritance;


public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    private int pesel;

    public Osoba() {
    }

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

   @Override
    public String toString(){
        return "Jestem osoba i nazywam sie: " + imie + " " + nazwisko;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        boolean czyRowne = false;
        Osoba drugaOsoba = (Osoba) obj;
        if(obj instanceof Osoba){
//            Osoba drugaOsoba = (Osoba) obj;
            czyRowne = this.pesel ==  drugaOsoba.pesel;

        }
        return czyRowne;
    }

    public void toString(int wiek){

    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void OpiszOsobe(){
        System.out.println("Nazywam sie: " + imie + " " + nazwisko);
    }
}
