package pl.sda.poznan.observer;

import org.junit.Test;

import static org.junit.Assert.*;

public class StockObserverTest {

    @Test
    public void test(){
        Stock orlen = new Stock("Orlen", 10);

        new StockObserver(orlen);
        new PercentStockObserver(orlen);
        orlen.setPrice(10);
        orlen.setPrice(20);
        orlen.setPrice(20);
        orlen.setPrice(30);

        }


}