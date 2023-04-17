package lupe.codewars.katas.kotlin.spinWords

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class SpinWordsTestKotlin {
    private val spinWordsTest = SpinWords()
    @ParameterizedTest
    @MethodSource("parameters")
    fun spinWordsTest(tester: String, expected: String) {
        assertEquals(spinWordsTest.spinWords(tester), expected)
    }

    companion object {
        @JvmStatic
        fun parameters() = Stream.of(
                Arguments.of("", ""),
                Arguments.of("1", "1"),
                Arguments.of("12345", "54321"),
                Arguments.of("Hello", "olleH"),
                Arguments.of("You are a wizzard Harry", "You are a drazziw yrraH"),
            )
        }
    }


