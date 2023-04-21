package lupe.codewars.katas.kotlin.maskify

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class MaskifyTestKotlin {
    private val maskifyTest = Maskify()

    @ParameterizedTest
    @MethodSource("parameters")
    fun maskifyTest(test: String, result: String) {
        assertEquals(maskifyTest.maskify(test), result)
    }

    companion object {
        @JvmStatic
        fun parameters() = listOf(
                Arguments.of("", ""),
                Arguments.of("1234", "1234"),
                Arguments.of("12345", "#2345"),
                Arguments.of("11114444", "####4444"),
                Arguments.of("1234567890", "######7890"),
        )
    }
}