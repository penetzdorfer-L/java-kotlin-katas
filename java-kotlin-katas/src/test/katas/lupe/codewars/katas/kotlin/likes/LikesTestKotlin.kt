package lupe.codewars.katas.kotlin.likes

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class LikesTestKotlin {
    private val likesTest = Likes();

    @ParameterizedTest
    @MethodSource("parameters")
    fun likesTest(names: Array<String>, result: String) {
        assertEquals(likesTest.likes(names), result)
    }

    companion object {
        @JvmStatic
        fun parameters() = listOf(
                Arguments.of(arrayOf(""), "no one likes this"),
                Arguments.of(arrayOf("Paul"), "Paul likes this"),
                Arguments.of(arrayOf("Paul", "Mel"), "Paul and Mel like this"),
                Arguments.of(arrayOf("Paul", "Mel", "Totti"), "Paul, Mel and Totti like this"),
                Arguments.of(arrayOf("Paul", "Mel", "Totti", "Mike"), "Paul, Mel and 2 others like this"),
                Arguments.of(arrayOf("Paul", "Mel", "Totti", "Mike", "a", "s", "5", "7", "kljaölkfdjal", "opllea"), "Paul, Mel and 8 others like this"),
        )
    }
}