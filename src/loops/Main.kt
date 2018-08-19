package loops


fun main(args: Array<String>) {
    var index: Int = 0
    val nums = 1..10
    val value = 3

    println("WHILE:")
    while (index <= 10) {
        println("index: $index")
        index++
    }

    println("-----")

    println("DO-WHILE:")
    index = 0
    do {
        println("index: $index")
        index++
    } while (index <= 10)

    println("-----")

    println("for:")
    for(num in nums) {
        println("num: $num")
    }

    println("-----")

    println("for - step 2:")
    for(num in nums step 2) {
        println("num: $num")
    }

    println("-----")

    println("for - downTo 5 step 2:")
    for(num in 10 downTo 5 step 2) {
        println("num: $num")
    }

    println("-----")

    println("for - break:")
    for(num in nums) {
        if (num == value) {
            println("3 - $num")
            break
        }
    }

    println("-----")

    println("for - break:")
    val characters = 'a'..'z'
    println("find charackter: ${isChar('i')(characters)}")
}

fun isChar(char: Char) = {
    characters: CharRange -> char in characters
}
