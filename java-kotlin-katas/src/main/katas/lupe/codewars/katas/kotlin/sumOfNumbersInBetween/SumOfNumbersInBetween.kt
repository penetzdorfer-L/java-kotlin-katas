package lupe.codewars.katas.kotlin.sumOfNumbersInBetween

import kotlin.math.abs

class SumOfNumbersInBetween {

    fun getSum(a: Int, b: Int): Int {
        return (a + b) * (abs(a - b) + 1) / 2;
    }
}