package lupe.codewars.katas.kotlin.bouncinbBalls

import bouncing.bouncingBall
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class BouncingBallsKtTest {
    @ParameterizedTest
    @MethodSource("parameters")
    fun testBouncing(h: Double, bounce: Double, window: Double, expected: Int) {
        val result = bouncingBall(h, bounce, window)
        assertEquals(result, expected)
    }

    companion object {
        @JvmStatic
        fun parameters(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(3.0, 0.66, 1.5, 3),
                Arguments.of(2.0, 0.5, 1.0, 1),
                Arguments.of(30.0, 0.66, 1.5, 15),
                Arguments.of(30.0, 0.75, 1.5, 21),
                Arguments.of(10.0, 0.6, 10.0, -1),
                Arguments.of(40.0, 1.0, 10.0, -1),
                Arguments.of(-5.0, 0.66, 1.5, -1),
                Arguments.of(5.0, -1.0, 1.5, -1),
                Arguments.of(0.0 ,0.0 ,0.0,-1),
                Arguments.of(0.0 ,1.0 ,0.0,-1),
                Arguments.of(0.0 ,0.0 ,1.0,-1),
                Arguments.of(1.0 ,1.0 ,1.0,-1),
                Arguments.of(10000000000.00, 1.00, 1.00, -1)
            )
        }
    }
}