package operators

import java.math.BigDecimal

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE

fun main(args: Array<String>) {
    println("Plus:")
    val p1 = Point(10, 20)
    var p2 = Point(30, 40)
    println(p1 + p2)

    p2 += Point(3, 4)
    println(p2)
    println("---------------")

    println("BinaryOperator:")
    val p3 = Point(10, 20)
    println(p3 * 1.5)
    println("---------------")

    val list = arrayListOf(1, 2)
    list += 3
    val newList = list + listOf(4, 5)
    println(list)
    println(newList)
    println("---------------")

    var bd = BigDecimal.ZERO
    println(bd++)
    println(++bd)
}
