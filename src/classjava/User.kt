package classjava

class User(val email: String) {
    fun sum(a: Int): Int {
        return a
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sum(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }

    fun test() {
        println("User class: test")
    }
}
