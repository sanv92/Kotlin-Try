package operators

import java.util.Calendar

enum class TimeInterval { DAY, WEEK, YEAR }

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

fun MyDate.addTimeIntervals(timeInterval: TimeInterval, number: Int): MyDate {
    val c = Calendar.getInstance()
    c.set(year, month, dayOfMonth)

    when (timeInterval) {
        TimeInterval.DAY -> c.add(Calendar.DAY_OF_MONTH, number)
        TimeInterval.WEEK -> c.add(Calendar.WEEK_OF_MONTH, number)
        TimeInterval.YEAR -> c.add(Calendar.YEAR, number)
    }

    return MyDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DATE))
}

operator fun MyDate.plus(timeInterval: TimeInterval) = addTimeIntervals(timeInterval, 1)

fun main(args: Array<String>) {
    val date = MyDate(2014, 5, 1)

    println(date + TimeInterval.YEAR + TimeInterval.WEEK)
}
