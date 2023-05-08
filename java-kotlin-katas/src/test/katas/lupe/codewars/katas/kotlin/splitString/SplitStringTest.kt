package lupe.codewars.katas.kotlin.splitString

import lupe.codewars.katas.java.splitStrings.SplitStrings
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class SplitStringTest {

    @ParameterizedTest
    @MethodSource("parameters")
    fun testSolution(parameter: String, expected: Array<String>) {
        val splitString = SplitStrings();
        assertArrayEquals(splitString.solution(parameter), expected)
    }

    companion object {
        @JvmStatic
        fun parameters(): Stream<Arguments> {
            return Stream.of(
                Arguments.of("", arrayOf<String>()),
                Arguments.of("a", arrayOf("a_")),
                Arguments.of("abcd", arrayOf("ab", "cd")),
                Arguments.of("abcde", arrayOf("ab", "cd", "e_")),
                Arguments.of("abcd e ", arrayOf("ab", "cd", " e", " _"))
            )
        }
    }
}