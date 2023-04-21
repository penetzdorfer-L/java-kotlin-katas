package lupe.codewars.katas.java.maskify;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaskifyTestJava {
    private Maskify maskify = new Maskify();
    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("", ""),
                Arguments.of("11114444", "####4444"),
                Arguments.of("114444", "##4444"),
                Arguments.of("1111111114444", "#########4444"),
                Arguments.of("abcdefg", "###defg"),
                Arguments.of("123", "123"),
                Arguments.of("1234", "1234")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void maskify(String str, String expected) {
        assertEquals(maskify.maskify(str), expected);
    }
}