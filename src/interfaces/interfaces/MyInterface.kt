package interfaces.interfaces


interface MyInterface {
    fun fun1()

    fun fun2()

    fun fun3(a: String?):String? {
        return a
    }

    fun fun4(a: String):String {
        return a
    }
}
