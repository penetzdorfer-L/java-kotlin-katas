package lupe.codewars.katas.java.squareSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareSum {
    public int squareSum(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        int initialValue = 0;
        List<Integer> numbersList = new ArrayList<>();
        Arrays.stream(numbers).forEach(numbersList::add);
        return numbersList.stream()
                .map(el -> el * el)
                .reduce(initialValue, Integer::sum);
    }
}
