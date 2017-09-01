package pl.sda.poznan.enums;

import org.junit.Test;

import static org.junit.Assert.*;

public class SizeTest {
    @Test
    public void test(){
        Size s = Size.MEDIUM;
        s.getAbbreviation();
    }

}