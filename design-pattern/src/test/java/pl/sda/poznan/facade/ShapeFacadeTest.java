package pl.sda.poznan.facade;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeFacadeTest {

    @Test
    public void test(){
        ShapeFacade facade = new ShapeFacade();
        facade.drawAll();
    }

}