package oop.inheritance;

/**
 * Created by RENT on 2017-07-24.
 */
public class PrzemyslowyRobot extends Robot {


    @Override
    public void OpiszSie() {
        super.OpiszSie();
    }

    @Override
    public void Napraw() {
        System.out.println("Naprawianie");
    }

    @Override
    public void pracuj() {
        System.out.println("Pracuje");
    }
}
