package collections.list


fun main(args: Array<String>) {
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

    val result = list.binarySearch(User("User 55"))
    println("result: $result")

    val result2 = list.binarySearchBy("User 88") { it.name }
    println("result: $result2")
}
