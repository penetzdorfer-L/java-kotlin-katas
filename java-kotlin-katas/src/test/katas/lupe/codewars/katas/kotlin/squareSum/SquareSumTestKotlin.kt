package lupe.codewars.katas.kotlin.squareSum

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class SquareSumTestKotlin {
    private val squareSumTest = SquareSum();
    @ParameterizedTest
    @MethodSource("parameters")
    fun squareSumTest(numbers: IntArray, result: Int) {
        Assertions.assertEquals(squareSumTest.squareSum(numbers), result)
    }
    companion object {
        @JvmStatic
        fun parameters() = listOf(
            Arguments.of(intArrayOf(0), 0),
            Arguments.of(intArrayOf(1,2,2), 9),
            Arguments.of(intArrayOf(1,-2,-2), 9),
            Arguments.of(intArrayOf(1,2,2,2), 13),
            Arguments.of(intArrayOf(1), 1)
        )
    }
}