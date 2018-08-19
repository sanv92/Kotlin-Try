package dataclass


class Point2(var i: Int, var j: Int)
fun point (i: Int, j: Int) = Point(i, j)

fun main(args: Array<String>) {
    // #1
    val person: Person = Person("Sander", 22)
    val person2 = person.copy()

    person2.age = 15

    println(person)
    println(person2)

    // #2
    val p1 = Point(1, 2)
    val p2 = Point(1, 2)
    val p3 = point(1, 2)
    val p4 = point(1, 2)
    val p5 = Point2(1, 2)
    val p6 = Point2(1, 2)

    println("p1 == p2: ${p1 == p2}")
    println("p3 == p4: ${p3 == p4}")
    println("p5 == p6: ${p5 == p6}")
}

