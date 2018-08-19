package collections

fun main(args: Array<String>) {
    val list = listOf(1, 2, 4)

    println(list.all { it == 4 })
    println(list.any { it == 3 })
    println(list.any { it == 4 })
}
