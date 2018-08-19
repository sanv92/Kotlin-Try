package operators.range


import java.time.LocalDate

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate) = when {
        year != other.year -> year - other.year
        month != other.month -> month - other.month
        else -> dayOfMonth - other.dayOfMonth
    }
}

class DateRange(val start: MyDate, val endInclusive: MyDate) {
    operator fun contains(d: MyDate): Boolean = when(d) {
        in start..endInclusive -> true
        else -> false
    }
}

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
        object : Iterator<LocalDate> {
            var current = start

            override fun hasNext() =
                    current <= endInclusive

            override fun next() = current.apply {
                current = plusDays(1)
            }
        }

fun main(args: Array<String>) {
    val first = MyDate(2014, 1, 5)
    val last = MyDate(2015, 1, 1)

    println(MyDate(2014, 1, 1) in DateRange(first, last))
    println(MyDate(2014, 1, 10) in DateRange(first, last))

    println("---------------------------")

    val newYear = LocalDate.ofYearDay(2017, 1)
    val daysOff = newYear.minusDays(3)..newYear
    for (dayOff in daysOff) { println(dayOff) }
}
