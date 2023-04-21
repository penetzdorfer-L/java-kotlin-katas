package lupe.codewars.katas.java.squareSum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareSumTestJava {

    private SquareSum squareSum = new SquareSum();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(new int[]{1,2,2}, 9),
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{1,-2,-2}, 9),
                Arguments.of(new int[]{1,2,2}, 9)
        );
    }


    @ParameterizedTest
    @MethodSource("parameters")
    public void testSquareSum(int[] argument, int expected) {
        assertEquals(squareSum.squareSum(argument), expected);
    }

}