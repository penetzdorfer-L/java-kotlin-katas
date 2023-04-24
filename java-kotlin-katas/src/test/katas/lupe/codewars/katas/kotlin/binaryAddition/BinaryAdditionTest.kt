package lupe.codewars.katas.kotlin.binaryAddition

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class BinaryAdditionTest {

    @ParameterizedTest
    @MethodSource("parameters")
    fun testBinaryAddition(a: Int, b: Int, expected: String) {
        val BinaryAddition = BinaryAddition()
        assertEquals(BinaryAddition.binaryAddition(a, b), expected)
    }
    companion object {
        @JvmStatic
        fun parameters(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(1, 1, "10"),
                Arguments.of(60, 60, "1111000"),
                Arguments.of(-1, -1, "11111111111111111111111111111110"),
                Arguments.of(55, 56, "1101111"),
                Arguments.of(0, 0, "0"),
                Arguments.of(1, 0, "1")
            )
        }
    }
}