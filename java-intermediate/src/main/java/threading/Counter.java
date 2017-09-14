package threading;

public class Counter {

    private volatile int value;

    public synchronized void add(int value){
        this.value += value;
    }

    public int getValue() {
        return value;
    }

}
