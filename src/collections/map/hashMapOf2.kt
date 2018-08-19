package collections.map


fun main(args: Array<String>) {
    /**
     * HashMap
     */
    val map = hashMapOf<Ticket, Book>()

    // Java
    map.put(Ticket("f3nf89adr"), Book("Book 1"))
    map.put(Ticket("xmvaj2feq"), Book("Book 2"))

    // Kotlin
    map[Ticket("bmksmfoaq")] = Book("Book 3")
    map[Ticket("tmgioerfo")] = Book("Book 4")

    for ((key, value) in map) {
        println("key = $key, value = $value")
    }
}
