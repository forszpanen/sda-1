package pl.sda.poznan.decorator;

public class SgdDecorator extends Decorator {
    Currency currency;

    public SgdDecorator(Currency currency) {
        this.currency = currency;
    }


    public String getDescription() {
        return currency.getDescription() + " ,its singapore Dollar";
    }

    @Override
    public double cost(double value) {
        return 0;
    }
}
