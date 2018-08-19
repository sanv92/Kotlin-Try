package staticclass

fun main(args: Array<String>) {
    val r1 = myFirstFunction()
    val r2 = myFirstFunction2(2)
    val r3 = myFirstFunction3()
    val r4 = myFirstFunction4(1, 2)

    println("r1: ${r1}")
    println("r2: ${r2}")
    println("r3: ${r3}")
    println("r4: ${r4}")
}

private fun myFirstFunction(): Int {
    return 1
}

private fun myFirstFunction2(a: Int): Int {
    return a
}

private fun myFirstFunction3() {
    println("test")
}

private fun myFirstFunction4(a: Int, b: Int): Int {
    return a + b
}
