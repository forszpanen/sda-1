package pl.sda.poznan.enums;

import org.junit.Test;

public class SizeTest {
    @Test
    public void test(){
        Size s = Size.MEDIUM;
        s.getAbbreviation();
    }

}