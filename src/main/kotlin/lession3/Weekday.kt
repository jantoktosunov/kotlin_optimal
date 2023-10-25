package lession3

enum class Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

fun getWeekdayName(weekday: Weekday): String {
    return when (weekday) {
        Weekday.MONDAY -> "Monday"
        Weekday.TUESDAY -> "Tuesday"
        Weekday.WEDNESDAY -> "Wednesday"
        Weekday.THURSDAY -> "Thursday"
        Weekday.FRIDAY -> "Friday"
        Weekday.SATURDAY -> "Saturday"
        Weekday.SUNDAY -> "Sunday"
    }
}
fun main() {
    val today = Weekday.WEDNESDAY
    println("Today is ${getWeekdayName(today)}")
}