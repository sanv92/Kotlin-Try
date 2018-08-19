package operators.range2


class DateRange(val start: MyDate, val endInclusive: MyDate) {
    operator fun contains(d: MyDate): Boolean = when(d) {
        in start..endInclusive -> true
        else -> false
    }
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}


data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override operator fun compareTo(date: MyDate): Int {
        if (this.year > date.year) return 1
        if (this.year < date.year) return -1
        if (this.month > date.month) return 1
        if (this.month < date.month) return -1
        if (this.dayOfMonth > date.dayOfMonth) return 1
        if (this.dayOfMonth < date.dayOfMonth) return -1

        return 0
    }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2

fun main(args: Array<String>) {
    val date = MyDate(2017, 5, 5)
    val date1 = MyDate(2017, 5, 5)
    val date2 = MyDate(2018, 5, 5)

    println(compare(date1, date2))
    println(checkInRange(date, date1, date2))
    println(checkInRange(date, date2, date1))
}
