package lupe.codewars.katas.java.vowelCount;

import java.util.Arrays;

public class VowelCount {
    public int getCount(String str) {
        return Arrays.stream(str.toLowerCase().split(""))
                .filter(el -> el.equals("a") || el.equals("e") || el.equals("i") || el.equals("o") || el.equals("u"))
                .toList().size();
    }
}


// BEST PRACTICES on codewars //

/*

public static int getCount(String str) {
    return str.replaceAll("(?i)[^aeiou]", "").length();
}

public static int getCount(String str) {
    return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
}

*/