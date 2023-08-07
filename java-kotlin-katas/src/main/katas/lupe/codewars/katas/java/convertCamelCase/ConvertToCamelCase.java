package lupe.codewars.katas.java.convertCamelCase;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertToCamelCase {
    public String convert(String s) {
        if (s.isEmpty()) {
            return "";
        }
        char first = s.charAt(0);
        String collect = Arrays.stream(s.split("[^A-Za-z0-9]"))
                .map(el -> el.substring(0, 1).toUpperCase() + el.substring(1))
                .collect(Collectors.joining());
        return collect.charAt(0) == first ? collect : collect.substring(0,1).toLowerCase() + collect.substring(1);
    }


    // BEST PRACTICE from Codewars //

    public String convertV2(String s) {
        String[] words = s.split("[^A-Za-z0-9]");
        return Arrays.stream(words, 1, words.length)
                .map(el -> el.substring(0, 1).toUpperCase() + el.substring(1))
                .reduce(words[0], String::concat);
    }
}
