package pl.sda.poznan.decorator;

public class SgdDollarDecorator implements Decorator {

    private Currency currency;

    public SgdDollarDecorator(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String getName() {
        return currency.getName() + ", it's a Singapore dollar";
    }
}
