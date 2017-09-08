package pl.sda.poznan.observer;

abstract class Observer<T> {
    private T observedObject;

    Observer(T observedObject) {
        this.observedObject = observedObject;
    }

    abstract void onChange(T sender, PriceChangedEventArgs e);

}
