package pl.sda.poznan.observer;

public class PercentStockObserver extends Observer<Stock> {

    public PercentStockObserver(Stock observedObject) {
        super(observedObject);
        observedObject.attachObserver(this);
    }

    @Override
    void onChange(Stock sender, PriceChangedEventArgs e) {
        //stara_cena -> 100
        //nowa_cena -> x

        double x = 100 * e.getNewPrice() / e.getOldPrice();

    }
}
