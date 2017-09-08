package pl.sda.poznan.builder;

import org.junit.Test;

public class ComputerTest {

    @Test
    public void test(){
        Computer mojKomputer =
                new Computer.ComputerBuilder()
                .addProcessor("Intel i5")
                .addMainboard("Asus H270")
                .addRam("8 gb")
                .addHdd("SSD 250 gb").build();

    }

    @Test
    public void builderTest(){
        Computer.ComputerBuilder builder = new Computer.ComputerBuilder();
        //pobieranie informacji o plycie glownej

        builder.addMainboard("Asus b150");

        //wybrano plyte
        //teraz wybierz ram
        builder.addRam("8gb ddr4 2133");

        Computer build = builder.build();

    }
}