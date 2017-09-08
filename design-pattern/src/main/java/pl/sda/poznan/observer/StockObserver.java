package pl.sda.poznan.observer;

public class StockObserver extends Observer<Stock> {

    public StockObserver(Stock stock) {
        this.t = stock;
        this.t.attachObserver(this);
    }

    @Override
    public void onChange(Object sender, PriceChangedEventArgs e) {
        System.out.println("Price has changed!!! Old price " + e.getOldPrice() + " New price " + e.getNewPrice());
    }
}
