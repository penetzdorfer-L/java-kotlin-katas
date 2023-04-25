package lupe.codewars.katas.java.sumOfNumbersInBetween;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SumOfNumbersInBetweenTest {

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(1,0,1),
                Arguments.of(1,1,1),
                Arguments.of(1,5,15),
                Arguments.of(-1,-2,-3),
                Arguments.of(-10, 10, 0),
                Arguments.of(1, 100, 5050)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void testSumInbetween(int a, int b, int expected) {
        SumOfNumbersInBetween sumOfNumbersInBetween = new SumOfNumbersInBetween();
        assertEquals(sumOfNumbersInBetween.getSum(a, b), expected);
    }

}