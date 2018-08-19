package collections.set


fun main(args: Array<String>) {
    /**
     * linkedHashSet
     */
    val set = setOf(
            "q222" to "1",
            "x333" to "2",
            "d111" to "3",
            "g444" to "4",
            "j111" to "5",
            "d111" to "6",
            "d111" to "7"
    )

    println("set: $set")

    for (value in set) {
        println("value = $value")
    }
}
