package collections


fun main(args: Array<String>) {
    println("customers.values.toSet(): ${customers.values.toSet()}")
    println("customers: ${customers[lucas]}")
    println("shop.getSetOfCustomers(): ${shop.getSetOfCustomers()}")
    println("getCustomersFrom: ${shop.getCustomersFrom(Canberra)}")
    println("getCitiesCustomersAreFrom: ${shop.getCitiesCustomersAreFrom()}")
    println("checkAllCustomersAreFrom: ${shop.checkAllCustomersAreFrom(Canberra)}")
    println("getCustomerWithMaximumNumberOfOrders: ${shop.getCustomerWithMaximumNumberOfOrders()}")
    println("getCustomersSortedByNumberOfOrders: ${shop.getCustomersSortedByNumberOfOrders()}")

    val test0 = listOf(City("a"), City("b"), City("c"))
    println("test0: $test0")

    val test1 = hashMapOf<String, City>()
    test1.putAll(
            setOf(
                    "a" to Canberra,
                    "b" to Canberra,
                    "c" to Canberra
            )
    )
    test1["d"] = Canberra
    println("test1: ${test1}")

    val test2 = hashMapOf<String, City>()
    test2["a"] = Canberra
    println("test2: ${test2}")

    val test3 = arrayListOf(City("a"), City("b"), City("c"))
    test3.add(City("Tallinn"))
    println("test3: $test3")

    val test4 = mutableListOf<City>(City("Tallinn"), City("Tallinn2"))
    test4.add(City("Tallinn3"))
    println("test4: $test4")

    val test5 = mapOf(1 to "x", 2 to "y", -1 to "zz")
    println("test5: ${test5.get(1)}")

    val list = listOf(1, 1, 1, 1, 1)
    // все элементы меньше 7?
    println("list.all: ${list.all { it == 1 }}")
}

data class Order(val products: List<Product>, val isDelivered: Boolean)

data class Product(val name: String, val price: Double) {
    override fun toString() = "'$name' for $price"
}

data class City(val name: String) {
    override fun toString() = name
}


// Products
val idea = Product("IntelliJ IDEA Ultimate", 199.0)
val reSharper = Product("ReSharper", 149.0)
val dotTrace = Product("DotTrace", 159.0)
val dotMemory = Product("DotTrace", 129.0)
val dotCover = Product("DotCover", 99.0)
val appCode = Product("AppCode", 99.0)
val phpStorm = Product("PhpStorm", 99.0)
val pyCharm = Product("PyCharm", 99.0)
val rubyMine = Product("RubyMine", 99.0)
val webStorm = Product("WebStorm", 49.0)
val teamCity = Product("TeamCity", 299.0)
val youTrack = Product("YouTrack", 500.0)

// Customers
val lucas = "Lucas"
val cooper = "Cooper"
val nathan = "Nathan"
val reka = "Reka"
val bajram = "Bajram"
val asuka = "Asuka"
val riku = "Riku"

// Cities
val Canberra = City("Canberra")
val Vancouver = City("Vancouver")
val Budapest = City("Budapest")
val Ankara = City("Ankara")
val Tokyo = City("Tokyo")



data class Customer(val name: String, val city: City, val orders: List<Order>) {
    override fun toString() = "$name from ${city.name}"
}

// Return the most expensive product which has been ordered
fun Customer.getMostExpensiveOrderedProduct(): Product? = orders.flatMap({ it.products }).maxBy({ it.price })

fun customer(name: String, city: City, vararg orders: Order) = Customer(name, city, orders.toList())

fun order(vararg products: Product, isDelivered: Boolean = true) = Order(products.toList(), isDelivered)
// Return all products this customer has ordered
val Customer.orderedProducts: Set<Product> get() {
    return orders.flatMap({ it.products }).toSet()
}

// Return the sum of prices of all products that a customer has ordered.
// Note: the customer may order the same product for several times.
// fun Customer.getTotalOrderPrice(): Double = orders.flatMap({ it.products }).sumByDouble { it.price }
fun Customer.getTotalOrderPrice(): Double = orders.flatMap({ it.products }).sumByDouble { it.price }

// Return the most expensive product among all delivered products
// (use the Order.isDelivered flag)
fun Customer.getMostExpensiveDeliveredProduct(): Product? {
    return orders.filter({ it.isDelivered }).flatMap { it.products }.maxBy { it.price }
}

// Return all products that were ordered by at least one customer
val Shop.allOrderedProducts: Set<Product> get() {
    TODO()
}

data class Shop(val name: String, val customers: List<Customer>)
fun Shop.getSetOfCustomers(): Set<Customer> = customers.toSet()
fun Shop.getCustomersFrom(city: City): List<Customer> = customers.toSet().filter { it.city == city }
fun Shop.getCitiesCustomersAreFrom(): Set<City> = customers.map { it.city }.toSet()

// Return true if all customers are from the given city
fun Shop.checkAllCustomersAreFrom(city: City): Boolean = customers.all { it.city == city }

// Return true if there is at least one customer from the given city
fun Shop.hasCustomerFrom(city: City): Boolean = customers.any { it.city == city }

// Return the number of customers from the given city
fun Shop.countCustomersFrom(city: City): Int = customers.count { it.city == city }

// Return a customer who lives in the given city, or null if there is none
fun Shop.findAnyCustomerFrom(city: City): Customer? = customers.find { it.city == city }

// Return a customer whose order count is the highest among all customers
fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? = customers.maxBy { it.orders.count() }

// Return a list of customers, sorted by the ascending number of orders they made
fun Shop.getCustomersSortedByNumberOfOrders(): List<Customer> = customers.sortedBy { it.orders.count() }

// Return a map of the customers living in each city
fun Shop.groupCustomersByCity(): Map<City, List<Customer>> = customers.groupBy { it.city }

// Return how many times the given product was ordered.
// Note: a customer may order the same product for several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    return customers.flatMap { it.orders }.flatMap { it.products }.count { it == product }
}



fun shop(name: String, vararg customers: Customer) = Shop(name, customers.toList())

val shop = shop("jb test shop",
        customer(lucas, Canberra,
                order(reSharper),
                order(reSharper, dotMemory, dotTrace)
        ),
        customer(cooper, Canberra),
        customer(nathan, Vancouver,
                order(rubyMine, webStorm)
        ),
        customer(reka, Budapest,
                order(idea, isDelivered = false),
                order(idea, isDelivered = false),
                order(idea)
        ),
        customer(bajram, Ankara,
                order(reSharper)
        ),
        customer(asuka, Tokyo,
                order(idea)
        ),
        customer(riku, Tokyo,
                order(phpStorm, phpStorm),
                order(phpStorm)
        )
)

val customers: Map<String, Customer> = shop.customers.fold(hashMapOf<String, Customer>(), { map, customer ->
    map[customer.name] = customer
    map
})
