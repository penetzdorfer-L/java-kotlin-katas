package lupe.codewars.katas.java.spinWords;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
    public String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(el -> el.length() >= 5 ? new StringBuilder(el).reverse() : el)
                .collect(Collectors.joining(" "));
    }
}