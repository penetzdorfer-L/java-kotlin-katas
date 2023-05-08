package lupe.codewars.katas.kotlin.piglatin

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class PigLatinTest {
    private val pigLatin = PigLatin();

    @ParameterizedTest
    @MethodSource("parameters")
    fun testTranslation(parameter: String, expected: String) {
        assertEquals(pigLatin.translate(parameter), expected)
    }

    companion object {
        @JvmStatic
        fun parameters(): Stream<Arguments> {
            return Stream.of(
                Arguments.of("", ""),
                Arguments.of("abcd", "bcdaay"),
                Arguments.of("Hello World!", "elloHay orld!Way"),
                Arguments.of("Hello World !", "elloHay orldWay !"),
                Arguments.of(".......alabama", ".......alabama"),
                Arguments.of("fjuepslkjhe79ndnökjeaöjnd7uß", "juepslkjhe79ndnökjeaöjnd7ußfay")
            )
        }
    }
}