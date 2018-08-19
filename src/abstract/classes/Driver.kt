package abstract.classes


class Driver(name: String) : Person(name) {
    override var age: Int = 1

    override fun getAddress(): String {
        return "Test 2"
    }

    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }
}
