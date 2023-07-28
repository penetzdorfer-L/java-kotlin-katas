package lupe.codewars.katas.kotlin.arraydiff

fun arrayDiff(a: IntArray, b: IntArray): IntArray {
    val first = a.toMutableList()
    first.removeAll(b.toMutableList())
    return first.toIntArray()
}