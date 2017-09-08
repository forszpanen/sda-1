package pl.sda.poznan.decorator;

public class UsdDollarDecorator implements Decorator {

    private Currency currency;

    public UsdDollarDecorator(Currency currency) {
        this.currency = currency;
    }

    //Wlasciwy proces dekorowania
    //Dollar zostal udekorowany o nazwe
    @Override
    public String getName() {
        return currency.getName() + ", it's US Dollar";
    }
}
