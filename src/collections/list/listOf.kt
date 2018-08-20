package collections.list


fun main(args: Array<String>) {
    /**
     * Arrays$ArrayList
     */
    val list = listOf<User>(
            User("User 11"),
            User("User 22"),
            User("User 33"),
            User("User 44"),
            User("User 55"),
            User("User 66"),
            User("User 77"),
            User("User 88")
    )

    /**
     * "listOf" is not mutable, use "mutableListOf" collection if you need mutable collection.
     */
    // list.add(User("User 99"))

    val result1 = list.map { it.name }
    println("result: $result1")

    println("------------")

    println(list.all { it == User("User 11") })
    println(list.any { it == User("User 11") })
    println(list.any { it == User("User 88") })

    println("------------")

    val list2 = listOf(1, 2, 4)

    println(list2.all { it == 4 })
    println(list2.any { it == 3 })
    println(list2.any { it == 4 })
}
