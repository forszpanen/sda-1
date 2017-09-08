package pl.sda.poznan.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
public class Stock {
    @Getter
    @Setter
    private Double price;
    @Getter
    @Setter
    private String name;

    private List<Observer<Stock>> observers  =  new ArrayList<>();

    public void attachObserver(Observer<Stock> observer){
        observers.add(observer);
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if(price.equals(this.price)){
            return;
        }
        Double oldPrice = this.price;
        this.price = price;
        OnPriceChanged(new PriceChangedEventArgs(oldPrice, price));
    }

    protected void OnPriceChanged(PriceChangedEventArgs eventArgs){
        for (Observer o : observers){
            o.onChange(this, eventArgs);
        }
    }


}
