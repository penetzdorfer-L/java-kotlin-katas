package lupe.codewars.katas.kotlin.countDistinctNumbers

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

class CountDuplicateLettersKtTest {

    @ParameterizedTest
    @MethodSource("parameters")
    fun testCountDuplicateLetters(parameter: String, expected: Int)  {
        val result = duplicateCount(parameter)
        assertEquals(result, expected)
    }
    companion object {
        @JvmStatic
        fun parameters(): Stream<Arguments> {
            return Stream.of(
                Arguments.of("", 0),
                Arguments.of("aA", 1),
                Arguments.of("aAb", 1),
                Arguments.of("aba", 1),
                Arguments.of("Aba", 1),
                Arguments.of("AbA", 1),
                Arguments.of("AbAb", 2),
                Arguments.of("AbAB", 2),
                Arguments.of("ABAb", 2),
                Arguments.of("ABAB", 2),
                Arguments.of("abcd", 0),
                Arguments.of("abcdeaa", 1),
                Arguments.of("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ", 26),
                Arguments.of("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", 26),
                Arguments.of("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAbb", 2)
            )
        }
    }
}