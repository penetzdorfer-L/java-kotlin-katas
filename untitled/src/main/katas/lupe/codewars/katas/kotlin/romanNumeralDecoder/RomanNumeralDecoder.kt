package lupe.codewars.katas.kotlin.romanNumeralDecoder

class RomanNumeralDecoder {
    fun decode(str: String): Int {
        if (str.isEmpty()) {
            return 0;
        }
        return convertMultiCharNumerals(str.uppercase())
                .split("")
                .filter { el -> filterNonRomanNumerals(el) }
                .sumOf { el -> transformToNumeral(el) }
    }

    private fun convertMultiCharNumerals(str: String): String{
        return str.replace("IV", "IIII")
                .replace("IX", "VIIII")
                .replace("XL", "XXXX")
                .replace("XC", "LXXXX")
                .replace("CD", "CCCC")
                .replace("CM", "DCCCC")
    }

    private fun transformToNumeral(str: String): Int {
        return when (str) {
            "I" -> 1
            "V" -> 5
            "X" -> 10
            "L" -> 50
            "C" -> 100
            "D" -> 500
            else -> 1000
        }
    }

    private fun filterNonRomanNumerals(str: String): Boolean {
        return str == "I"
                || str == "V"
                || str == "X"
                || str == "L"
                || str == "C"
                || str == "D"
                || str == "M"
    }
}