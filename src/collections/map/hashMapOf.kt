package collections.map


fun main(args: Array<String>) {
    /**
     * HashMap
     */
    val map = hashMapOf<String, Any>()

    // Java
    map.put("Name 1", 1)
    map.put("Name 2", 2)

    // Kotlin
    map["Name 3"] = 3
    map["Name 4"] = 4

    for ((key, value) in map) {
        println("key = $key, value = $value")
    }

    println("----------")

    val user = mapOf(
            "Name 1" to 3,
            "Name 2" to 4
    )

    for ((key, value) in user) {
        println("key = $key, value = $value")
    }
}
