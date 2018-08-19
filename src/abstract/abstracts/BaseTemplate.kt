package abstract.abstracts


abstract class BaseTemplate {
    protected var count: Int = 0

    fun a1() {
        count++

        println("Count: $count")
    }

    abstract fun minus()
}
