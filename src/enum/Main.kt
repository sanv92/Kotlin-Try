package enum

import Color.Color
import Color.Color2


fun main(args: Array<String>) {
    var message: Color = Color.GREEN
    var message2: String = Color.RED.name

    println("message: $message")
    println("message2: $message2")

    println("Color.GREEN.name: ${Color.GREEN.name}")
    println("Color.GREEN.colorHex: ${Color.GREEN.colorHex}")
    println("Color.GREEN.opacity: ${Color.GREEN.opacity}")

    println("--------------------")

    println("getFavoriteColor: ${getFavoriteColor(Color.BLACK)}")
    println("getFavoriteColor2: ${getFavoriteColor2(Color.BLUE, Color.YELLOW)}")
    println("getFavoriteColor2: ${getFavoriteColor2(Color.BLUE, Color.WHITE)}")

    println("--------------------")

    println("Color2.BLUE.rgb(): ${Color2.BLUE.rgb()}")
}

fun getFavoriteColor(color: Color) = when (color) {
    Color.BLACK -> "Black"
    Color.WHITE -> "White"
    Color.RED -> "Red"
    Color.GREEN -> "Green"
    Color.BLUE, Color.YELLOW -> "Blue and Yellow"

    else -> "None"
}

fun getFavoriteColor2(color1: Color, color2: Color) = when (setOf(color1, color2)) {
    setOf(Color.BLACK, Color.WHITE) -> "Black and White"
    setOf(Color.RED, Color.GREEN) -> "Red and Green"
    setOf(Color.BLUE, Color.YELLOW) -> "Blue and Yellow"

    else -> "None"
}
