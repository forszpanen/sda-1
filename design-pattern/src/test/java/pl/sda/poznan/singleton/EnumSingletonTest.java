package pl.sda.poznan.singleton;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class EnumSingletonTest {

  @Test
    public void enumTest(){
      EnumSingleton firstInstance = EnumSingleton.INSTANCE;
      EnumSingleton second = EnumSingleton.INSTANCE;
      String name = firstInstance.INSTANCE.getName();

      assertNotNull(firstInstance);
      assertNotNull(second);
      assertSame(firstInstance, second);
  }

}