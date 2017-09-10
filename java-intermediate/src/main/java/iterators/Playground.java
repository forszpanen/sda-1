package iterators;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Playground {
    public static void main(String[] args) {
        Collection<String> collection = Arrays.asList("Ala", "ma", "Kota");

        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()){
            String elem = iterator.next();
            System.out.println(elem);
        }


        collection.removeIf(n -> n.startsWith("A"));

        collection.forEach(System.out::println);
    }
}
