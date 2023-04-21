package lupe.codewars.katas.java.vowelCount;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class VowelCountTest {

    private final VowelCount vowelCount = new VowelCount();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("Hello", 2),
                Arguments.of("World", 1),
                Arguments.of("aaaaaaayyyyyy", 7),
                Arguments.of("ttttttttt", 0),
                Arguments.of("a e i o u", 5),
                Arguments.of("lellollullillal", 5)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void testVowelCount(String argument, int expected) {
        assertEquals(vowelCount.getCount(argument), expected);
    }

}