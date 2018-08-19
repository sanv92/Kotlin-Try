package packages

data class Car(private var weight: Double, private var size: Int) {

    var isNew: Boolean = false

        get() {
            return weight > size
        }

       set(value) {
           if (value) {
               println("YES!")
           }

           field = value
       }
}
