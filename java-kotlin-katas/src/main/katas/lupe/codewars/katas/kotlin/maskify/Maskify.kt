package lupe.codewars.katas.kotlin.maskify

class Maskify {
    fun maskify(cc: String): String {
        return if (cc.length < 4) cc
                else cc.replace(".".toRegex(), "#")
                        .substring(0, cc.length - 4) +
                        cc.substring(cc.length -4)
    }
}

