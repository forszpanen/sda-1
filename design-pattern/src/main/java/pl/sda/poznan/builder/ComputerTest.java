package pl.sda.poznan.builder;

import org.junit.Test;

public class ComputerTest {
    @Test
    public void compTest() {
        Computer.ComputerBuilder computerBuilder = new Computer.ComputerBuilder()
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true);


        computerBuilder.addHdd("MyHdd");


        Computer comp = computerBuilder.build();

    }
}