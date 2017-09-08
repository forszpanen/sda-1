package pl.sda.poznan.factory.generic;

import pl.sda.poznan.factory.JsonPersonFileReader;
import pl.sda.poznan.factory.PersonFileReader;
import pl.sda.poznan.factory.TxtPersonFileReader;
import pl.sda.poznan.factory.XmlPersonFileReader;
import pl.sda.poznan.factory.enumexample.PersonReaderFileType;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 *
 */
public class PersonReaderFactory implements Factory<PersonReaderFileType, PersonFileReader> {


    private Map<PersonReaderFileType, Supplier<PersonFileReader>> map = new HashMap<>();

//    Moje uwagi to : Poprawic cos tam

    //dostawca<T>
    //T dosatrcz();

    public PersonReaderFactory() {
        map.put(PersonReaderFileType.TXT, TxtPersonFileReader::new);
        map.put(PersonReaderFileType.JSON, () -> new JsonPersonFileReader());
        map.put(PersonReaderFileType.XML, () -> new XmlPersonFileReader());

    }

    public PersonFileReader create(PersonReaderFileType key) {

//        if(map.containsKey(key)){
//            //map.get(key) pobiera wartosc o podanym kluczu
//            Supplier<PersonFileReader> supplier = map.get(key);
//            //suppliet.get() pobiera i uruchamia wyrazenie lambda
//            return supplier.get();
//        }
//        return null;
        //moze byc zastapione przez:

        return map.containsKey(key) ? map.get(key).get() : null;
    }
}
