package pl.sda.poznan.decorator;

public class Dollar implements Currency {
    @Override
    public String getName() {
        return "This is Dollar";
    }
}
