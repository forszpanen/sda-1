package oop.inheritance;

/**
 * Created by RENT on 2017-07-24.
 */
public abstract class Robot implements Pracujacy{


    public void OpiszSie(){
        System.out.println("Jestem robotem");
    }

    public abstract void Napraw();

}
