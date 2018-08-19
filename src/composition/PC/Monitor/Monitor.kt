package composition.PC.Monitor

class Monitor(val model: String, val size: Int,  val resolution: Resolution) {
    fun drawPixelAt(x: Int, y: Int, color: String) {
        println("Drawing pixel at $x,$y in colour $color")
    }
}
