package pl.sda.poznan.decorator;


import org.junit.Test;

public class DecoratorTest {

    @Test
    public void test() {
        // without adding decorators

        Currency curr = new Dollar();

        System.out.println(curr.getDescription() + " dollar. " + curr.cost(2.0));


        //adding decorators

        Currency curr2 = new UsdDecorator(new Dollar());

        System.out.println(curr2.getDescription() + " dollar. " + curr2.cost(4.0));

        Currency curr3 = new SgdDecorator(new Dollar());

        System.out.println(curr3.getDescription() + " dollar. " + curr3.cost(4.0));
    }

}