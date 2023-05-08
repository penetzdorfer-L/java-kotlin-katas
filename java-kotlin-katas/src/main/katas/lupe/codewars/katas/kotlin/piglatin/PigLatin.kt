package lupe.codewars.katas.kotlin.piglatin

import java.util.stream.Collectors

class PigLatin {
    fun translate(str: String): String {
        return str.split(" ").stream()
            .filter { it.isNotEmpty() }
            .map { if (it.startsWith('!')
                || it.startsWith('?')
                || it.startsWith('.')) it
                else it.substring(1) + it.first() + "ay" }
            .collect(Collectors.joining(""))
    }
}