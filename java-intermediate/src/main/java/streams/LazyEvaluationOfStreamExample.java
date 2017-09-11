package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluationOfStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Stream<Integer> integerStream = numbers.stream().filter(n -> n > 5).sorted(Comparator.reverseOrder());

        numbers.addAll(Arrays.asList(11, 12, 13));

        //lazy
        for (Integer i : integerStream.collect(Collectors.toList())) {
            System.out.println(i);
        }

        Stream<Double> generate = Stream.generate(Math::random);
        List<Double> collect = generate.collect(Collectors.toList());
        System.out.println(collect.size());
    }
}
