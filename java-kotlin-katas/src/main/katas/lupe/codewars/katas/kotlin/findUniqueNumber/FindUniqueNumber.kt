package lupe.codewars.katas.kotlin.findUniqueNumber

import kotlin.math.absoluteValue

//TODO finish that goddamn task

class FindUniqueNumber {
    fun findUnique(numbers: DoubleArray): Double {
        return if(numbers.isEmpty()) 0.0 else numbers
            .associateBy { it.absoluteValue }
            .entries
            .first { it.value.toInt() == 1 }
            .value
    }
}