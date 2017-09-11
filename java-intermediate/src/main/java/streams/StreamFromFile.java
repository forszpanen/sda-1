package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFromFile {
    public static final String FILE_PATH = "examplefile.txt";

    public static void main(String[] args) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get(FILE_PATH)));

//        String text = "Ala Ala Ala Lorem Ala";
        Stream<String> words = Stream.of(text.split(" "));
        Stream<String> lorem = words.map(s -> s.toLowerCase()).filter(s -> s.startsWith("lorem"));

        List<String> collect = lorem.collect(Collectors.toList());
        List<String> arr = new ArrayList<>();

        Stream<Object> empty = Stream.empty();

        //


        Map<String, List<String>> collect1 = Stream.of(text.split(" ")).collect(Collectors.groupingBy(s -> s));
        Map<Boolean, List<String>> collect2 = Stream.of(text.split(" ")).collect(Collectors.groupingBy(s -> s.equals("ipsum")));


        Map<String, Long> collect3 = Stream.of(text.split(" ")).collect(Collectors.groupingBy(s -> s, Collectors.counting()));


        Integer reduce = Stream.of(1, 2, 3, 4).reduce(0, Integer::sum, (i, sum) -> i / sum);


    }
}
