package lupe.codewars.katas.java.goodvsevil;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class GoodVsEvilTest {
    private GoodVsEvil goodVsEvil = new GoodVsEvil();
    @ParameterizedTest
    @CsvSource({
            "1 1 1 1 1 1, 1 1 1 1 1 1 1, Battle Result: Evil eradicates all trace of Good",
            "1 0 0 0 0 0, 0 0 0 0 0 0 0, Battle Result: Good triumphs over Evil",
            "0 0 0 0 0 0, 0 0 0 0 0 0 0, Battle Result: No victor on this battle field",
            "2 2 2 2 2 2, 1 1 1 1 1 1 1, Battle Result: Good triumphs over Evil",
            "1 2 3 4 5 6, 1 2 3 4 5 6 7, Battle Result: Evil eradicates all trace of Good",
            "6 5 4 3 2 1, 7 6 5 4 3 2 1, Battle Result: Evil eradicates all trace of Good"
    })
    void testBattle(String goodAmounts, String evilAmounts, String expected) {
        String result = goodVsEvil.battle(goodAmounts, evilAmounts);
        assertEquals(result, expected);
    }
}