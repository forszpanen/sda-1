package pl.sda.poznan.factory;

import org.junit.Test;
import pl.sda.poznan.factory.simplefactory.SimplePersonReaderFactory;

import static org.junit.Assert.*;

public class SimplePersonReaderFactoryTest {
    @Test
    public void createReader() throws Exception {

        String dummyPath = "plik.txt";
        SimplePersonReaderFactory factory = new SimplePersonReaderFactory();

        PersonFileReader fileReader = factory.createReader(dummyPath);


//        List<Person> people = fileReader.readAll();
        assertTrue(fileReader instanceof TxtPersonFileReader);
        assertEquals(TxtPersonFileReader.class, fileReader.getClass());

    }

    @Test
    public void jsonReaderTest(){
        String path = "C:\\pliki\\osoby.json";
        SimplePersonReaderFactory factory = new SimplePersonReaderFactory();
        PersonFileReader fileReader = factory.createReader(path);

//        List<Person> people = fileReader.readAll();

        assertTrue(fileReader instanceof JsonPersonFileReader);
        assertEquals(JsonPersonFileReader.class, fileReader.getClass());
    }

}