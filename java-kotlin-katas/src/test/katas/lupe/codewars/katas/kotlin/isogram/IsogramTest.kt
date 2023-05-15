package lupe.codewars.katas.kotlin.isogram

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class IsogramTest {
    val isogram = Isogram()

    @ParameterizedTest
    @MethodSource("parameters")
    fun testIsogramChecker(parameter: String, expected: Boolean) {
        assertEquals(isogram.checkIsogram(parameter), expected)
    }

    companion object {
        @JvmStatic
        fun parameters(): Stream<Arguments> {
            return Stream.of(
                    Arguments.of("", true),
                    Arguments.of("aaaaa", false),
                    Arguments.of("aaaAAAaaab", false),
                    Arguments.of("abcdefghijklmnopqrstuvwxyz", true),
                    Arguments.of("Hi World", true),
                    Arguments.of("H i W o r l d", true),
                    Arguments.of(" ", true),
                    Arguments.of("      kiuz     I", false)
            )
        }
    }
}