package lupe.codewars.katas.java.prodFibonacci;

public class ProdFibonacci {
    public long[] productFib(long prod) {
        long first = 0; long second = 1; long aggregate; long result = 0;
        while(first * second < prod) {
            aggregate = first + second;
            first = second;
            second = aggregate;
        }
        return new long[]{first, second, first*second == prod ? result + 1 : result};
    }
}
