package lupe.codewars.katas.java.coutIpAddresses;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CountIpAddressesTest {
    private final CountIpAddresses countIpAddresses = new CountIpAddresses();
    @ParameterizedTest
    @CsvSource({
            "10.0.0.0, 10.0.0.50, 50",
            "20.0.0.10, 20.0.1.0, 246",
            "0.0.0.0, 255.255.255.255, 4294967295",
            "1.1.1.1, 1.1.1.1, 0",
            "1.1.1.1, 1.1.1.2, 1"
    })
    public void testIpCounting(String start, String end, long expected) {
        long result = countIpAddresses.ipsBetween(start, end);
        assertEquals(result, expected);
    }
}