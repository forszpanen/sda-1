package threading;

import java.nio.file.Path;

public class ArrayAsync {
    private double[] array;
    private int THREADS_COUNT;
    private Thread[] threads;
    private double sum;
    private final Object locker = new Object();



    public ArrayAsync(double[] array, int THREADS_COUNT) {
        this.array = array;
        this.THREADS_COUNT = THREADS_COUNT;

        //zainicjalozowac tablice watkow
        threads = new Thread[THREADS_COUNT];
    }

    public double StartCalculations() throws InterruptedException {
        for(int i =0; i<threads.length; i++){

            int helper = i;
            threads[i] = new Thread(() -> {
                singleThreadTask(helper);
            });

            threads[i].start();
            threads[i].join();
        }

        return sum;
    }

    private void singleThreadTask(int startIndex){
        double result = 0;
        for(int i = startIndex; i<array.length; i+= THREADS_COUNT){
            result += array[i];
        }

        //na koniec, po posumowaniu swojej czesci
        //powinien dodac do ogolnej/wynikowej sumy
        synchronized (locker){
            sum += result;
        }
    }
}
