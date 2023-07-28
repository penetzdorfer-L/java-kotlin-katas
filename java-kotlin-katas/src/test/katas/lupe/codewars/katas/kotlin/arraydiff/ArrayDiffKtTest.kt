package lupe.codewars.katas.kotlin.arraydiff

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class ArrayDiffKtTest {


    @ParameterizedTest
    @MethodSource("parameters")
    fun arrayDiffTest(parameter: IntArray, diff: IntArray, expected: IntArray) {
        val result = arrayDiff(parameter, diff)
        assertArrayEquals(result, expected)
    }

    companion object {
        @JvmStatic
        fun parameters(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(intArrayOf(1), intArrayOf(1), intArrayOf()),
                Arguments.of(intArrayOf(1, 2), intArrayOf(1), intArrayOf(2)),
                Arguments.of(intArrayOf(1, 1, 1, 1, 1, 2), intArrayOf(1), intArrayOf(2)),
                Arguments.of(intArrayOf(1, 2, 3, 4, 5, 6, 7, 1), intArrayOf(1), intArrayOf(2, 3, 4, 5, 6, 7)),
                Arguments.of(intArrayOf(2, 2, 2, 2, 1), intArrayOf(1), intArrayOf(2, 2, 2, 2)),
                Arguments.of(intArrayOf(), intArrayOf(), intArrayOf())
            )
        }
    }
}