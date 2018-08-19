package inlinefun


inline fun isA(value: Int, fn: (a: Int) -> Int):Int {
    return fn(value)
}

fun main(args: Array<String>) {
    val calc = { a: Int -> a * 2 }

    println(isA(123, calc))
}
