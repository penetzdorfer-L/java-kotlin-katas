package lupe.codewars.katas.kotlin.vowelCount

class VowelCount {
    fun getCount(str: String): Int {
        return str.lowercase().split("").stream()
            .filter {it.equals("a") || it.equals("e") || it.equals("i") || it.equals("o") || it.equals("u") }
            .count().toInt()
    }
}