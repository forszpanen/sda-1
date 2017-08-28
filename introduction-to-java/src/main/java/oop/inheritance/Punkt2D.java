package oop.inheritance;

/**
 * Created by RENT on 2017-07-21.
 */
public class Punkt2D {
    private int x;
    private int y;

    public Punkt2D() {
        x = 0;
        this.y = 0;
    }

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String Opisz(){
       return "Moje wspolrzedne to: " + x + " " + y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
