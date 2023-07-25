package lupe.codewars.katas.java.arraydiff;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDiff {
    public int[] arrayDiff(int[] a, int[] b) {
        List<Integer> integerList = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> sub = Arrays.stream(b).boxed().toList();
        integerList.removeAll(sub);
        return integerList.stream().mapToInt(i -> i).toArray();
    }
}
