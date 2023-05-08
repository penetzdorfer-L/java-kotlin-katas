package lupe.codewars.katas.kotlin.findUniqueNumber

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class FindUniqueNumberTest {

    @ParameterizedTest
    @MethodSource("parameters")
    fun testFindUnique(parameters: DoubleArray, expected: Double) {
        val findUniqueNumber = FindUniqueNumber();
        assertEquals(findUniqueNumber.findUnique(parameters), expected)
    }

    companion object {
        @JvmStatic
        fun parameters(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(doubleArrayOf(), 0),
                Arguments.of(doubleArrayOf(1.0, 1.0, 1.0, 1.0, 1.0, 2.0), 2),
                Arguments.of(doubleArrayOf(1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 2.0, 2.0, 2.0, 4.0), 4),
                Arguments.of(doubleArrayOf(1.099511627776E12, 1.099511627776E12, 1.125899906842624E15), 1.125899906842624E15),
                Arguments.of(doubleArrayOf(2.200000, 1.31313131313131313131313, 1.31313131313131313131313), 2.200000),
                Arguments.of(doubleArrayOf(1.0, 1.0, 1.0, 2.0, 2.0, 2.0, 3.0, 3.0, 3.0, 4.0, 4.0, 4.0, 5.0, 5.0, 5.0), 0),
                Arguments.of(doubleArrayOf(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 2.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0), 2)
            )
        }
    }
}