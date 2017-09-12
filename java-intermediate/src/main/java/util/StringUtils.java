package util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StringUtils {

    // "Laptop" -> {"L", "a", "p", "t", "o", "p"}
    public static Stream<String> getLetters(String word) {
        List<String> result = new ArrayList<>();


        for (int i = 0; i < word.length(); i++) {
            result.add(String.valueOf(word.charAt(i)));
        }


//        for(Character c : word.toCharArray()){
//            result.add(c.toString());
//        }

        return result.stream();
    }
}
