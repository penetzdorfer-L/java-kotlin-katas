package lupe.codewars.katas.java.piglatin;

import net.bytebuddy.asm.MemberSubstitution;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PigLatinTest {

    private final PigLatin pigLatin = new PigLatin();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("", ""),
                Arguments.of("abcd", "bcdaay"),
                Arguments.of("Hello World!", "elloHay orld!Way"),
                Arguments.of("Hello World !", "elloHay orldWay !"),
                Arguments.of(".......alabama", ".......alabama"),
                Arguments.of("fjuepslkjhe79ndnökjeaöjnd7uß", "juepslkjhe79ndnökjeaöjnd7ußfay")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void testTranslation(String parameter, String expected) {
        assertEquals(pigLatin.translate(parameter), expected);
    }

}