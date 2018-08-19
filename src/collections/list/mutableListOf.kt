package collections.list


fun main(args: Array<String>) {
    /**
     * ArrayList
     */
    val list = mutableListOf<User>(
            User("User 11"),
            User("User 22"),
            User("User 33"),
            User("User 44"),
            User("User 55"),
            User("User 66"),
            User("User 77"),
            User("User 88")
    )

    list.add(User("User 99"))
    list.addAll(
            listOf(
                    User("User 111"),
                    User("User 122"),
                    User("User 133")
            )
    )

    val result1 = list.map { it.name }
    println("result: $result1")

    // -----

    for (item in list) {
        println("item: ${item.name}")
    }
}
