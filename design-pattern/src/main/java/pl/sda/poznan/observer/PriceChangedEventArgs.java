package pl.sda.poznan.observer;

public class PriceChangedEventArgs {
    private double oldPrice;
    private double newPrice;

    public PriceChangedEventArgs(double oldPrice, double newPrice) {
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
    }

    public double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(double newPrice) {
        this.newPrice = newPrice;
    }
}
