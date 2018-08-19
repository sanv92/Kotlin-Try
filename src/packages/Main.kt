package packages

import packages.animals.cat.CatA


fun main(args: Array<String>) {
    val person = Person("Bruce", "Wayne", 30)
    val car = Car(20.5, 20)

    car.isNew = true

    println("firstname: ${person.firstname}")
    println("lastname: ${person.lastname}")
    println("age: ${person.age}")

    println("car.isNew: ${car.isNew}")

    val cat = CatA()

    println(cat.a1())
    println(cat.a2())
}
