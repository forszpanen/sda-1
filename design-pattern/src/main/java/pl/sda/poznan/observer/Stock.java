package pl.sda.poznan.observer;

import java.util.ArrayList;
import java.util.List;

public class Stock {

    private String name;

    //chcemy obserwowac zmiene ceny
    //chcemy byc powiadomieni o kazdej zmianie ceny
    private double price;

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //lista wszystkich obserwatorow
    private List<Observer<Stock>> observers = new ArrayList<>();

    public void attachObserver(Observer<Stock> observer){
        observers.add(observer);
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price == this.price) {
            return;
        }

        double oldPrice = this.price;
        this.price = price;

        //powiadomic wszystkich obserwatorow
        PriceChangedEventArgs eventArgs = new PriceChangedEventArgs(oldPrice, price);
        for (Observer o : observers) {
            o.onChange(this, eventArgs);
        }
    }
}
