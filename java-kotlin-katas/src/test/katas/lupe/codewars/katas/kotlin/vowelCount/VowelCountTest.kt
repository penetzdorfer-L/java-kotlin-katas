package lupe.codewars.katas.kotlin.vowelCount

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class VowelCountTest {
    private val vowelCount = VowelCount()

    @ParameterizedTest
    @MethodSource("parameters")
    fun testVowelCount(argument: String, expected: Int) {
        assertEquals(vowelCount.getCount(argument), expected)
    }

    companion object {
        @JvmStatic
        fun parameters(): Stream<Arguments> {
            return Stream.of(
                Arguments.of("Hello", 2),
                Arguments.of("World", 1),
                Arguments.of("aaaaaaayyyyyy", 7),
                Arguments.of("ttttttttt", 0),
                Arguments.of("a e i o u", 5),
                Arguments.of("lellollullillal", 5)
            )
        }
    }
}