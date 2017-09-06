package pl.sda.poznan.decorator;

public class Dollar extends Currency {

    double value;

    public Dollar() {
        this.description = "Dollar";
    }

    @Override
    public double cost(double value) {
        this.value = value;
        return value;
    }
}
