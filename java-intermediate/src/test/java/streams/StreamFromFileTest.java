package streams;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class StreamFromFileTest {

    private static String pathToFile = "D:\\Documents\\java\\sda\\examplefile.txt";

    @Test
    public void streams() throws IOException {

        //wczytanie zawartosci calego pliku do pojedynczego stringa
        String text = new String(Files.readAllBytes(Paths.get(pathToFile)));

        //utowrzenie strumienia z napisu, ktory splitujemy po spacji
        String[] split1 = text.split(" ");

        Stream<String> split = Stream.of(split1);


        //przemapowanie kazdego napisu na male litery i zebranie do mapy
        Map<String, Long> collect = split
                .map(s -> s.toLowerCase())
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));





        //
//
//        Map<String, Long> collect1 = Stream.of(new String(Files.readAllBytes(Paths.get(pathToFile))).split(" "))
//                .map(s -> s.toLowerCase())
//                .map(s -> s.trim())
//                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
//


    }

}