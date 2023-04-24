package lupe.codewars.katas.java.binaryAddition;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BinaryAdditionTest {

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(1, 1, "10"),
                Arguments.of(60, 60, "1111000"),
                Arguments.of(-1, -1, "11111111111111111111111111111110"),
                Arguments.of(55, 56, "1101111"),
                Arguments.of(0, 0, "0"),
                Arguments.of(1, 0, "1")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void testBinaryAddition(int a, int b, String expected) {
        BinaryAddition binaryAddition = new BinaryAddition();
        assertEquals(binaryAddition.binaryAddition(a, b), expected);
    }
}