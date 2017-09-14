package threading;

public class Countdown implements Runnable {

    private int limit;
    private String name;

    public Countdown(int limit, String name) {
        this.limit = limit;
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = limit; i>0; i--){
            System.out.println(name + " " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
