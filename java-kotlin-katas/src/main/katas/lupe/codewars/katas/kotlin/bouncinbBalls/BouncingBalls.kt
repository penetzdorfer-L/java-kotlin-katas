package bouncing

fun bouncingBall(h: Double, bounce: Double, window: Double):Int {
    val checker = checkConditions(h, bounce, window)
    return if(checker) calculateTimesSeen(h, window, bounce)
    else -1
}

fun checkConditions(h: Double, bounce: Double, window: Double): Boolean {
    return h > window && bounce < 1.00 && bounce > 0.00
}

private fun calculateTimesSeen(h: Double, window: Double, bounce: Double): Int {
    var currentHeight = h
    var timesSeen = 0
    while (currentHeight > window) {
        timesSeen++
        currentHeight *= bounce
        if (currentHeight > window) timesSeen++
    }
    return timesSeen
}