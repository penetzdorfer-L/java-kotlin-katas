package lupe.codewars.katas.java.romanNumeralDecoder;

import java.util.Arrays;

public class RomanNumeralDecoder {
    public int decoder(String roman) {
        if (roman.isEmpty()) {
            return 0;
        }
        int initialValue = 0;
        String s = convertMultiCharNumeral(roman.toUpperCase());
        return Arrays.stream(s.split(""))
                .filter(this::filterNonRomanNumerals)
                .map(this::transformToNumeral)
                .reduce(Integer::sum)
                .orElse(0);
    }

    private int transformToNumeral(String el) {
        return switch (el) {
            case "I" -> 1;
            case "V" -> 5;
            case "X" -> 10;
            case "L" -> 50;
            case "C" -> 100;
            case "D" -> 500;
            default -> 1000;
        };
    }


    private boolean filterNonRomanNumerals(String str) {
        return str.equals("I")
                || str.equals("V")
                || str.equals("X")
                || str.equals("L")
                || str.equals("C")
                || str.equals("D")
                || str.equals("M");
    }

    private String convertMultiCharNumeral(String roman) {
        return roman.replace("IV", "IIII")
                .replace("IX", "VIIII")
                .replace("XL", "XXXX")
                .replace("XC", "LXXXX")
                .replace("CD", "CCCC")
                .replace("CM", "DCCCC");
    }
}
