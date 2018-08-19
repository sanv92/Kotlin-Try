package collections.list


fun main(args: Array<String>) {
    /**
     * Array
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
}
