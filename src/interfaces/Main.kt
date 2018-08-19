package interfaces

import interfaces.interfaces.A
import interfaces.interfaces.B
import interfaces.interfaces.MyInterface

fun main(args: Array<String>) {
    val v1: MyInterface = A()
    val v2: MyInterface = B()

    v1.fun1()
    v2.fun1()
}
