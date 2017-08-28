import oop.inheritance.Pracujacy;
import oop.inheritance.PrzemyslowyRobot;
import oop.inheritance.RobotZabawkowy;
import oop.inheritance.StudentZaoczny;

public class Main {

    public static void main(String[] args) {
        Pracujacy pracownik = new StudentZaoczny();
        Pracujacy pracownik2 = new RobotZabawkowy();
        Pracujacy pracownik3 = new PrzemyslowyRobot();
    }


}

