package lupe.codewars.katas.java.arraydiff;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArrayDiffTest {

    private final ArrayDiff arrayDiff = new ArrayDiff();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(new int[]{1}, new int[]{1}, new int[]{}),
                Arguments.of(new int[]{1,2}, new int[]{1}, new int[]{2}),
                Arguments.of(new int[]{1,1,1,1,1,2}, new int[]{1}, new int[]{2}),
                Arguments.of(new int[]{1,2,3,4,5,6,7,1}, new int[]{1}, new int[]{2,3,4,5,6,7}),
                Arguments.of(new int[]{2,2,2,2,1}, new int[]{1}, new int[]{2,2,2,2}),
                Arguments.of(new int[]{}, new int[]{}, new int[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void testArrayDiff(int[] parameter, int[] sub, int[] expected) {
        int[] result = arrayDiff.arrayDiff(parameter, sub);
        assertArrayEquals(result, expected);
    }
}