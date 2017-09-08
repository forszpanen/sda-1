package pl.sda.poznan.observer;

public abstract class Observer<T> {

    protected T t;

    public abstract void onChange(Object sender, PriceChangedEventArgs e);
}
