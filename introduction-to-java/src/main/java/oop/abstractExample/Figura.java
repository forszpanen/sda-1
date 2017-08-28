package oop.abstractExample;

public abstract class Figura {

    private double pole;
    private double obwod;


    public abstract double ObliczPole();

    public abstract double ObliczObwod();


    public void Opisz(){
        System.out.println("Domyslny opis figury");
    }

    public double getPole() {
        return pole;
    }

    public void setPole(double pole) {
        this.pole = pole;
    }

    public double getObwod() {
        return obwod;
    }

    public void setObwod(double obwod) {
        this.obwod = obwod;
    }
}
