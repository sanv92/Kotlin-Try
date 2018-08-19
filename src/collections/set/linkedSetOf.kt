package collections.set


fun main(args: Array<String>) {
    /**
     * linkedHashSet
     */
    val set = linkedSetOf<String>()
    set.add("q222")
    set.add("x333")
    set.add("d111")
    set.add("g444")
    set.add("j111")
    set.add("u111")
    set.add("d111")
    set.add("d111")
    set.add("d111")
    set.add("d111")

    println("set: $set")

    for (value in set) {
        println("value = $value")
    }
}
