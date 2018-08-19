package collections.map


// LinkedHashMap
fun main(args: Array<String>) {
    /**
     * HashMap
     */
    val library = Library(
            hashMapOf(
                    Ticket("f3nf89adr") to Book("Book 1"),
                    Ticket("xmvaj2feq") to Book("Book 2"),
                    Ticket("fsdfkssfq") to Book("Book 3"),
                    Ticket("trtgrgsdf") to Book("Book 4"),
                    Ticket("caskofmao") to Book("Book 5"),
                    Ticket("rtioerfwq") to Book("Book 6"),
                    Ticket("rtioerfwq") to Book("Book 6"),
                    Ticket("rtioerfwq") to Book("Book 6")
            )
    )

    val ticket2 = Ticket("rtioerfwq")

    println(library)
    println("----------")
    for ((key, value) in library.map) {
        println("key = $key, value = $value")
    }
    println("----------")
    println(library.map[ticket2])
}
