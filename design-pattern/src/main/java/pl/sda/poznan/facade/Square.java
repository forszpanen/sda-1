package pl.sda.poznan.facade;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("To jest kwadrat");
    }
}
