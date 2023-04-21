package lupe.codewars.katas.java.romanNumeralDecoder;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralDecoderTestJava {

    private final RomanNumeralDecoder romanNumeralDecoder = new RomanNumeralDecoder();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("", 0),
                Arguments.of("I", 1),
                Arguments.of("i", 1),
                Arguments.of("IIIV", 6),
                Arguments.of("VI", 6),
                Arguments.of("ivabeIV", 8)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void testDecoder(String tester, int actual) {
        assertEquals(romanNumeralDecoder.decoder(tester), actual);
    }

}