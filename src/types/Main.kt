package types

fun main(args: Array<String>) {
    val name: String = "Sander"

    val a0: Byte = 123 // 8
    val a1: Short = 123 // 16
    val a2: Int = 123 // 32
    val a3: Float = 1.23F // 32
    val a4: Boolean = true // 32
    val a5: Double = 1.5 // 64
    val a6: Long = 123 // 64
    val a7: String = "123"

    val b1: String = a2.toString()
    val c1: Char = 'a'

    println("Hello - $name!")
    println("a0: $a0")
    println("a1: $a1")
    println("a2: $a2")
    println("a3: $a3")
    println("a4: $a4")
    println("a5: $a5")
    println("a6: $a6")
    println("a7: $a7")
    println("b1: $b1")
    println("c1: $c1")
}
