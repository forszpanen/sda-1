package pl.sda.poznan.observer;

public class StockObserver extends Observer<Stock> {

    public StockObserver(Stock stock) {
        super(stock);
        stock.attachObserver(this);
    }

    @Override
    void onChange(Stock sender, PriceChangedEventArgs e) {
        System.out.println("Cena sie zmienila: Stara cena: " + e.getOldPrice() + ", nowa cena: " + e.getNewPrice());
    }
}
