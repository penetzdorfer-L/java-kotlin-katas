package lupe.codewars.katas.java.findUniqueNumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FindUniqueNumberTestJava {
    private final FindUniqueNumber findUniqueNumber = new FindUniqueNumber();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(new double[]{}, 0),
                Arguments.of(new double[]{1,1,1,1,1,2}, 2),
                Arguments.of(new double[]{1,1,1,1,1,2,2,2,2,4}, 4),
                Arguments.of(new double[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,2,1,1,1,1,1,1}, 2),
                Arguments.of(new double[]{2.200000, 1.31313131313131313131313}, 2.200000),
                Arguments.of(new double[]{1.099511627776E12, 1.125899906842624E15}, 1.125899906842624E15)
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void testFindUnique(double[] parameter, double expected) {
        assertEquals(findUniqueNumber.findUnique(parameter), expected);
    }
}