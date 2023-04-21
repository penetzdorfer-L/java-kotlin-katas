package lupe.codewars.katas.kotlin.romanNumeralDecoder

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class RomanNumeralDecoderTestKotlin{
    private val romanNumeralDecoderTest = RomanNumeralDecoder();
    @ParameterizedTest
    @MethodSource("parameters")
    fun testDecoder(input: String, actual: Int) {
        assertEquals(romanNumeralDecoderTest.decode(input), actual)
    }

    companion object {
        @JvmStatic
        fun parameters(): Stream<Arguments> {
            return Stream.of(
                    Arguments.of("", 0),
                    Arguments.of("I", 1),
                    Arguments.of("c", 100),
                    Arguments.of("IIIV", 6),
                    Arguments.of("VI", 6),
                    Arguments.of("XXabcjkABCJK", 220),
            )
        }
    }
}