package lupe.codewars.katas.java.prodFibonacci;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;

class ProdFibonacciTest {

    private final ProdFibonacci prodFibonacci = new ProdFibonacci();

    public static Stream<Arguments> parmeters() {
        return Stream.of(
                of(1, new long[]{1, 1, 1}),
                of(4895, new long[]{55, 89, 1}),
                of(5895, new long[]{89, 144, 0}),
                of(602070, new long[]{610, 987, 1}),
                of(447577, new long[]{610, 987, 0}),
                of(74049690, new long[]{6765, 10946, 1}),
                of(84049690, new long[]{10946, 17711, 0}),
                of(193864606, new long[]{10946, 17711, 1}),
                of(1120149658760L, new long[]{832040, 1346269, 1}),
                of(2932589879121L, new long[]{1346269, 2178309, 1}),
                of(2932589879121L, new long[] {1346269, 2178309, 1})
        );
    }


    @ParameterizedTest
    @MethodSource("parmeters")
    public void testProdFib(long prod, long[] expected) {
        long[] result = prodFibonacci.productFib(prod);
        assertArrayEquals(result, expected);
    }

}