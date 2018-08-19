package collections.map


fun main(args: Array<String>) {
    /**
     * LinkedHashMap
     */
    val user = mapOf(
            Ticket("caskofmao") to Book("Book 5"),
            Ticket("rtioerfwq") to Book("Book 6")
    )

    for ((key, value) in user) {
        println("key = $key, value = $value")
    }
}
