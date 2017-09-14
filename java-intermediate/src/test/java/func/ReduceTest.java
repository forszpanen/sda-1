package func;

import org.junit.Test;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceTest {
    @Test
    public void test(){
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        Integer reduce = integerStream.reduce(0, (integer, integer2) -> integer + integer2);

        Optional<String> reduce1 = Stream.of("Ala", "ma").reduce((s, s2) -> s.concat(s2));

        System.out.println(reduce1.get());

    }
}
