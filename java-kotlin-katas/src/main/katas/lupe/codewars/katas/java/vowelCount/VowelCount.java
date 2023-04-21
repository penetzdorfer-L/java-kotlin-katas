package lupe.codewars.katas.java.vowelCount;

import java.util.Arrays;

public class VowelCount {
    public int getCount(String str) {
        return Arrays.stream(str.toLowerCase().split(""))
                .filter(el -> el.equals("a") || el.equals("e") || el.equals("i") || el.equals("o") || el.equals("u"))
                .toList().size();
    }
}
