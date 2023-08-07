package lupe.codewars.katas.java.convertCamelCase;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ConvertToCamelCaseTest {

    private final ConvertToCamelCase converter = new ConvertToCamelCase();

    @ParameterizedTest
    @CsvSource({
            "test-case, testCase",
            "test Case, testCase",
            "Test_Case, TestCase",
            "Test/case, TestCase",
            "test%case-two, testCaseTwo",
            "Test$Case-Two, TestCaseTwo",
            "test-Case-two, testCaseTwo",
            "Test-case-Two, TestCaseTwo",
            "test-Case-Two, testCaseTwo",
            "test-case-Two, testCaseTwo",
            "Test-Case-2, TestCase2",
    })
    public void testConverter(String parameter, String expected) {
        String result = converter.convert(parameter);
        assertEquals(result, expected);
        String resultV2 = converter.convertV2(parameter);
        assertEquals(resultV2, expected);
    }
}