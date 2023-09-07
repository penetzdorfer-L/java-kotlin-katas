package lupe.codewars.katas.kotlin.deoderantEvaporator

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class DeoderantEvaporatorKtTest {

    @ParameterizedTest
    @MethodSource("parameters")
    fun testEvaporation(content: Double, evapPerDay: Double, threshold: Double, expected: Int) {
        val result = evaporator(content, evapPerDay, threshold)
        assertEquals(result, expected)
    }

    @ParameterizedTest
    @MethodSource("parameters")
    fun testEvaporator2(content: Double, evapPerDay: Double, threshold: Double, expected: Int) {
        val result = evaporate2(content, evapPerDay, threshold)
        assertEquals(result, expected)
    }

    companion object {
        @JvmStatic
        fun parameters(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(10.0, 10.0, 10.0, 22),
                Arguments.of(10.0, 10.0, 5.0, 29),
                Arguments.of(100.0, 5.0, 5.0, 59),
                Arguments.of(50.0, 12.0, 1.0, 37),
                Arguments.of(47.5, 8.0, 8.0, 31),
                Arguments.of(100.0, 1.0, 1.0, 459),
                Arguments.of(10.0, 1.0, 1.0, 459),
                Arguments.of(100.0, 1.0, 5.0, 299)
            )
        }
    }
}