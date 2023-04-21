package lupe.codewars.katas.kotlin.spinWords

class SpinWords {
    fun spinWords(sentence: String): String {
         return sentence.split(" ").joinToString(" ") { el -> if (el.length >= 5) el.reversed() else el }
    }
}