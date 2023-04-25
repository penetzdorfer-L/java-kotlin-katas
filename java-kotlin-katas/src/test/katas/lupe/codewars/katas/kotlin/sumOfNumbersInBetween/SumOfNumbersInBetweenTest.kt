package lupe.codewars.katas.kotlin.sumOfNumbersInBetween

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class SumOfNumbersInBetweenTest {

    @ParameterizedTest
    @MethodSource("parameters")
    fun testSumOfInBetween(a: Int, b: Int, expected: Int) {
        val sumOfNumbersInBetween = SumOfNumbersInBetween();
        assertEquals(sumOfNumbersInBetween.getSum(a, b), expected);
    }

    companion object {
        @JvmStatic
        fun parameters(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(1, 0, 1),
                Arguments.of(1, 1, 1),
                Arguments.of(1, 5, 15),
                Arguments.of(-1, -2, -3),
                Arguments.of(-10, 10, 0),
                Arguments.of(1, 100, 5050)
            )
        }
    }
}