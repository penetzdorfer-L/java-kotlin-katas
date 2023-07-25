package lupe.codewars.katas.java.sumOfASequence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SumOfSequenceTest {

    SumOfSequence sumOfSequence = new SumOfSequence();


    @ParameterizedTest
    @CsvSource({
            "2,6,2,12",
            "5,4,1,0",
            "6,6,1,6",
            "1,5,3,5",
            "0,0,0,0",
            ""
    })
    void testSumOfSequence(int start, int end, int step, int expected) {
            assertEquals(sumOfSequence.sequenceSum(start, end, step), expected);
    }
}