package generic;

public class WorkableImplementation implements Workable{

    @Override
    public boolean canWork(Person p) {
        return p.getAge() > 18;
    }
}