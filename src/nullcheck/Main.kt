package nullcheck

fun main(args: Array<String>) {
    val str: String?

    str = getStr()
    if (str != null) {
        val size = str!!.length
        println(size)
    }
    else {
        println("str: error")
    }
}

fun getStr(a: String? = null): String? {
    return a
}
