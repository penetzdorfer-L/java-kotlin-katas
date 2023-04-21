package lupe.codewars.katas.kotlin.likes

class Likes {
    fun likes(names: Array<String>) : String {
        when (names.size) {
            0 -> { return "no one likes this" }
            1 -> {
                return if(names[0].isNotEmpty()) {
                    String.format("%s likes this", names[0])
                } else {
                    "no one likes this"
                }
            }
            2 -> { return String.format("%s and %s like this", names[0], names[1]) }
            3 -> { return String.format("%s, %s and %s like this", names[0], names[1], names[2]) }
        }
        return String.format("%s, %s and %d others like this", names[0], names[1], names.size - 2)
    }
}