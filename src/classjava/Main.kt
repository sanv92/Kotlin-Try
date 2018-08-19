package classjava

fun main(args: Array<String>) {
    val userJava = UserJava("sander1@gmail.com")
    val user = User("sander2@gmail.com")

    println("userJava.email: ${userJava.email}")
    println("user.email: ${user.email}")

    println("1: ${user.sum(a = 1)}")
    println("2: ${user.sum(a = 1, b = 2)}")
    println("3: ${user.sum(a = 1, b = 2, c = 3)}")
}
