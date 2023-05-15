package lupe.codewars.katas.kotlin.isogram

class Isogram {
    fun checkIsogram(s: String):Boolean {
        return s.length == s.lowercase().chars().distinct().count().toInt()
    }
}