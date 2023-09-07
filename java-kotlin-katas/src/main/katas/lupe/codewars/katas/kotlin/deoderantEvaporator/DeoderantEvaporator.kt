package lupe.codewars.katas.kotlin.deoderantEvaporator

fun evaporator(content: Double, evapPerDay: Double, threshold: Double): Int {
    var contentDupe = content
    val lastSpray = contentDupe/100 * threshold
    var days = 0
    while (contentDupe > lastSpray) {
        contentDupe -= (contentDupe/100) * evapPerDay
        days += 1
    }
    return days;
}

// BEST PRACTICE FROM CODEWARS //

fun evaporate2(content: Double, evapPerDay: Double, threshold: Double): Int {
    var perc = 100.0
    var days = 0
    while (perc > threshold) {
        perc -= perc * evapPerDay / 100
        days++
    }
    return days
}