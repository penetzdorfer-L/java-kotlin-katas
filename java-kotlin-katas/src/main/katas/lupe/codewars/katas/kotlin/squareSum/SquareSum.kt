package lupe.codewars.katas.kotlin.squareSum

class SquareSum {

    fun squareSum(numbers: IntArray): Int {
        return if (numbers.isEmpty()) 0
            else numbers
                .map { el -> el * el }
                .reduce { acc: Int, current: Int -> acc + current }
    }
}
