package lupe.codewars.katas.java.splitStrings;

import net.bytebuddy.agent.builder.AgentBuilder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SplitStringsTest {
    private final SplitStrings splitStrings = new SplitStrings();

    public static Stream<Arguments> parameters() {

        return Stream.of(
                Arguments.of("", new String[]{}),
                Arguments.of("a", new String[]{"a_"}),
                Arguments.of("abcd", new String[]{"ab", "cd"}),
                Arguments.of("abcde", new String[]{"ab", "cd", "e_"}),
                Arguments.of("abcd e ", new String[]{"ab", "cd", " e", " _"})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void testSplitString(String parameter, String[] expected) {
        assertArrayEquals(splitStrings.solution(parameter), expected);
    }
}