package threading;

public class CounterProgram {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        Runnable r = () -> {
            for(int i=0;i<1000; i++){
                counter.add(1);
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();


        System.out.println(counter.getValue());

    }
}
