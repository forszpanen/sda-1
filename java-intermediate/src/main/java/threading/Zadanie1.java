package threading;

public class Zadanie1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("MAIN POCZATEK!");


        Thread t1 = new Thread(new Countdown(50, "Watek1: "));
        Thread t2 = new Thread(new Countdown(50, "Watek2: "));
        Thread t3 = new Thread(new Countdown(50, "Watek3: "));
        t1.start();
        t2.start();
        t3.start();

//        t1.join();
//        t2.join();
//        t3.join();

        System.out.println("MAIN KONIEC!");
    }
}
