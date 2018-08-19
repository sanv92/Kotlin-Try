package streamapi

data class Player(val name: String, val age: Int)
data class Book(val title: String, val authors: List<String>)

fun main(args: Array<String>) {
    val createPlayer = ::Player
    val player = createPlayer("Sander", 26)
    val players = listOf(Player("Alice", 29), Player("Bob", 31), Player("Sander", 33))

    println("MemberReferences:")
    println(player)
    println("-------------------------------")

    println("EssentialsFilterAndMap:")
    println(players.filter { it.age > 30 })

    val list1 = listOf(1, 2, 3, 4)
    println(list1.map { it * it })

    println(players.map { it.name })
    println("-------------------------------")

    println("EssentialsFilterAndMap:")
    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers.mapValues { it.value.toUpperCase() })
    println("-------------------------------")

    println("AllAnyCountAndFindApplyingAPredicateToACollection:")
    val canBeInClub27 = { p: Player -> p.age <= 27 }
    println(players.all(canBeInClub27))
    println("-------------------------------")

    println("AllAnyCountAndFindApplyingAPredicateToACollection:")
    val list2 = listOf(1, 2, 3)
    println(list2.all { it == 4 })
    println(list2.any { it == 3 })
    println(list2.any { it == 4 })
    println("-------------------------------")

    println("GroupByConvertingAListToAMapOfGroups:")
    println(players.groupBy { it.age })

    val list = listOf("a", "ab", "b")
    println(list.groupBy(String::length))
    println("-------------------------------")

    println("FlatMapAndFlattenProcessingElementsInNestedCollections:")
    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })

    val books = listOf(Book("Thursday Next", listOf("Jasper Fforde")), Book("Mort", listOf("Terry Pratchett")), Book("Good Omens", listOf("Terry Pratchett", "Neil Gaiman")))
    println(books.flatMap { it.authors }.toSet())
    println("books.javaClass: ${books.javaClass}")
    println("-------------------------------")

    val test = listOf(1, 2, 3, 4).asSequence()
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }
    println("test: $test")
}
