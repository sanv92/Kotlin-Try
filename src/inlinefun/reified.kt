package inlinefun


inline fun <reified T> checkType(value: Any): Boolean {
    return value is T
}

fun main(args: Array<String>) {
    println(checkType<String>("abc"))
    println(checkType<String>(123))
}
