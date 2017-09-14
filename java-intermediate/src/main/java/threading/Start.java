package threading;

public class Start {
//    static class Zadanie implements Runnable{
//
//        @Override
//        public void run() {
//            System.out.println("To wykona sie na oddzielnym watku");
//        }
//    }


    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            System.out.println("Nowy watek");
            try {
                Thread.sleep(50000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Koniec watku");
        });

        System.out.println("");
        t1.start();

        t1.join();

        System.out.println("Watek main koniec");


    }
}
