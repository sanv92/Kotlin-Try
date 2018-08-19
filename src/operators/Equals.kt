package operators.equals


class Point(val x: Int, val y: Int) {
    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is Point) return false

        return other.x == x && other.y == y
    }
}

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override operator fun compareTo(other: MyDate): Int {
        if (this.year > other.year) return 1
        if (this.year < other.year) return -1
        if (this.month > other.month) return 1
        if (this.month < other.month) return -1
        if (this.dayOfMonth > other.dayOfMonth) return 1
        if (this.dayOfMonth < other.dayOfMonth) return -1

        return 0
    }
}

fun main(args: Array<String>) {
    println("EqualityOperator:")
    val p = Point(10, 20)
    println("1: ${p == p}") // checking pointer equals: if (obj === this) return true
    println("2: ${Point(10, 20) == Point(10, 20)}")
    println("3: ${Point(10, 20) != Point(5, 5)}")
    println("4: ${null == Point(1, 2)}")
    println("---------------")

    val first = MyDate(2014, 5, 10)
    val second = MyDate(2014, 7, 11)
    println("compareTo: ${first < second}")
    println("compareTo: ${first > second}")
}
