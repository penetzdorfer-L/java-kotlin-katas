package lupe.codewars.katas.java.piglatin;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PigLatin {
    public String translate(String str) {
        return str.isEmpty() ? "" : Arrays.stream(str.split(" "))
                .filter(el -> el.length() >= 1)
                .map(el -> el.charAt(0) == '!'
                        || el.charAt(0) == '?'
                        || el.charAt(0) == '.' ? el
                        : el.substring(1) + el.charAt(0) + "ay")
                .collect(Collectors.joining(" "));
    }
}


// BEST PRACTICE from Codewars //

/*

public static String pigIt(String str) {
    return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
}

*/
