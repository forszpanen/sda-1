package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPlayground {
    public static void main(String[] args) {
        List<String> someNumbers = Arrays.asList("N40", "N36", "B12", "B6", "G50", "G25", "G45");


//        Without streams
/*        List<String> result = new ArrayList<>();
        someNumbers.forEach( num -> {
            result.add(num);
            if(num.startsWith("G")){
                System.out.println(num);
            }
        });

        result.sort(Comparator.naturalOrder());*/

        //print results
        someNumbers.stream().map(String::toUpperCase).filter(s -> s.startsWith("G")).sorted().forEach(System.out::println);

        List<String> gList = someNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(gList.size());



    }
}
