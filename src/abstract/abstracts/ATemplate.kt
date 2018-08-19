package abstract.abstracts


class ATemplate : BaseTemplate() {
    override fun minus() {
        count--

        println("Count: $count")
    }
}
