package lupe.codewars.katas.java.spinWords;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpinWordsTestJava {

    private final SpinWords spinWords = new SpinWords();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("", ""),
                Arguments.of("1", "1"),
                Arguments.of("12345", "54321"),
                Arguments.of("Hello", "olleH"),
                Arguments.of("Hello Veronika, how are you doing today?", "olleH ,akinoreV how are you gniod ?yadot")
        );
    }
    @ParameterizedTest
    @MethodSource("parameters")
    void testSpin(String toTest, String expectedResult) {
        assertEquals(spinWords.spinWords(toTest), expectedResult);
    }

}