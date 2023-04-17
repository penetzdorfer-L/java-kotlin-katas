package lupe.codewars.katas.java.findUniqueNumber;

import java.util.Arrays;
import java.util.Map.Entry;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FindUniqueNumber {
    public double findUnique(double[] numbers) {
        return Arrays.stream(numbers).boxed()
                .collect(groupingBy(identity(), counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .map(Entry::getKey)
                .orElse(0.0);
    }
}
