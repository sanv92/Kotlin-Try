package Color


enum class Color(
        var colorHex: String,
        var opacity: Double = 1.0
) {
    WHITE("#FFFFFF"),
    BLACK("#000000"),
    RED("#FF0000", .5),
    GREEN("00FF00"),
    BLUE("#0000FF"),
    YELLOW("#FFFF00"),
}

enum class Color2(
        val r: Int, val g: Int, val b: Int
) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}
