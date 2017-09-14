package util;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringUtilsTest {
    @Test
    public void getLetters() throws Exception {

        List<String> strings = Arrays.asList("Piotr", "Jan", "Mariusz");

        Stream<Stream<String>> streamStream = strings.stream().map(StringUtils::getLetters);
        Stream<String> flatStream = strings.stream().flatMap(StringUtils::getLetters);


        List<String> collect = flatStream.collect(Collectors.toList());
        collect.forEach(System.out::println);



    }

}