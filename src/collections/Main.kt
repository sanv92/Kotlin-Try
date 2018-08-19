package collections

// - List
// arrayList
// linkedList
// vector

// - Set
// hashSet
// linkedHashSet
// TreeSet

// - Queue
// linkedList
// priorityQueue
// dequeue

// - Map
// hashMap
// hashTable
// treeMap


class User(val map: Map<String, Any?>)

fun main(args: Array<String>) {
    val map = hashMapOf<String, Int>()
    // Java
    map.put("one", 1)
    map.put("two", 2)

    // Kotlin
    map["three"] = 3
    map["four"] = 4

    for ((key, value) in map) {
        println("key = $key, value = $value")
    }

    // #3
    val user = User(
            mapOf(
                    "name" to "John Doe",
                    "age" to 25
            )
    )

    println("user: ${user.map}")
}
