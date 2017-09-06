package pl.sda.poznan.decorator;

public class UsdDecorator extends Decorator {
    Currency currency;


    public UsdDecorator(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String getDescription() {
        return currency.getDescription() + " ,its US Dollar";
    }

    @Override
    public double cost(double value) {
        return 0;
    }
}
