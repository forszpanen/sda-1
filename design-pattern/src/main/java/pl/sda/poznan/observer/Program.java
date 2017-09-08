package pl.sda.poznan.observer;

public class Program {

    public static void main(String[] args) {
        Stock stock = new Stock();
        new StockObserver(stock);

        stock.setPrice(10D);
        stock.setPrice(10D);
        stock.setPrice(15D);


    }
}
