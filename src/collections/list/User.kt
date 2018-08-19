package collections.list


data class User(val name: String) : Comparable<User> {
    override fun compareTo(other: User): Int {
        return name.compareTo(other.name)
    }
}
