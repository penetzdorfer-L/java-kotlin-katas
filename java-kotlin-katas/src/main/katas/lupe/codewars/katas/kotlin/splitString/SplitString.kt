package lupe.codewars.katas.kotlin.splitString

class SplitString {
    fun solution(s: String): Array<String> {
        if (s.length % 2 == 0) s else s + "_"
        return s.split("(?<=\\G.{2})").toTypedArray()
    }
}