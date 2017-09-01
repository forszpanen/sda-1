package pl.sda.poznan.singleton;

import org.junit.Test;
import pl.sda.poznan.phone.MobilePhone;

import static org.junit.Assert.*;

public class SingleObjectTest {
    @Test
    public void getInstance() throws Exception {
//        SingleObject singleObject = new SingleObject();

        MobilePhone object = SingleObject.getInstance();
        MobilePhone  object1 = SingleObject.getInstance();

        assertNotNull(object);
        assertNotNull(object1);
        assertSame(object, object1);
    }

}