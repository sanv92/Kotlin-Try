package abstract.classes


open class Person(var name: String) {
    open var age: Int = 0

    open fun getAddress(): String {
        return "Test"
    }

    override fun toString(): String {
        return "Person(name='$name')"
    }
}
