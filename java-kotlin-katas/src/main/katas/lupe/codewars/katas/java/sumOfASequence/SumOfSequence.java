package lupe.codewars.katas.java.sumOfASequence;

import java.util.stream.IntStream;

public class SumOfSequence {
    public int sequenceSum(int start, int end, int step) {
        return isValid(start, end) ? IntStream.iterate(start, i -> i <= end, i -> i + step).sum() : 0;
    }

    private boolean isValid(int start, int end) {
        return start < end || end != 0;
    }
}


// BEST PRACTICE Codewars //

/*
static int sequenceSum(int start, int end, int step) {
    return iterate(start, i -> i <= end, i -> i + step).sum();
}
*/