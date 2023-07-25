package lupe.codewars.katas.java.isogram;

import java.lang.annotation.Documented;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;



public class Isogram {
    public boolean isIsogram(String s) {
        return s.isEmpty()
                 || Stream.of(s.replaceAll(" ", "").split(""))
                .map(String::toLowerCase)
                .collect(groupingBy(Function.identity(), counting()))
                .values().stream()
                .allMatch(el -> el == 1);
    }
}
