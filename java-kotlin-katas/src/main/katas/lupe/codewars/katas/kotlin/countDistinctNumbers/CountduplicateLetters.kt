package lupe.codewars.katas.kotlin.countDistinctNumbers

fun duplicateCount(text: String): Int {
    return text
        .lowercase()
        .groupingBy { it }
        .eachCount()
        .count{it.value > 1}
}

/*


BEST PRACTICE FROM CODEWARS

fun duplicateCount(text: String): Int {
    return text
        .groupingBy { Char::toLowerCase }
        .count {it.value > 1}
}

*/