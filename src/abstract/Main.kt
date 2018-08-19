package abstract

import abstract.abstracts.ATemplate
import abstract.abstracts.BaseTemplate
import abstract.classes.Driver
import abstract.classes.Person


fun main(args: Array<String>) {
    val v3: BaseTemplate = ATemplate()

    v3.a1()
    v3.a1()
    v3.a1()
    v3.minus()
    v3.minus()
    v3.minus()

    val person: Person = Person("Person")
    println("person: $person")
    println("person.getAddress(): ${person.getAddress()}")

    val driver: Driver = Driver("Sander")
    println("driver: $driver")
    println("driver.getAddress(): ${driver.getAddress()}")
    println("driver.toString(): ${driver.toString()}")
}
