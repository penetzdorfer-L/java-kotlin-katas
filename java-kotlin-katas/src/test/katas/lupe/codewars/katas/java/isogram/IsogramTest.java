package lupe.codewars.katas.java.isogram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class IsogramTest {

    Isogram isogram = new Isogram();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("", true),
                Arguments.of("aaaaa", false),
                Arguments.of("aaaAAAaaab", false),
                Arguments.of("abcdefghijklmnopqrstuvwxyz", true),
                Arguments.of("Hi World", true),
                Arguments.of("H i W o r l d", true),
                Arguments.of(" ", true),
                Arguments.of("      kiuz     I", false)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void testChecker(String parameter, boolean expected) {
        Assertions.assertEquals(isogram.isIsogram(parameter), expected);
    }

}