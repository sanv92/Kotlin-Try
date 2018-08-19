package composition

import composition.PC.Monitor.Monitor
import composition.PC.Monitor.Resolution
import composition.PC.MotherBoard.MotherBoard
import composition.PC.PC

fun main(args: Array<String>) {
    val theMonitor = Monitor("27inch Beast", 27, Resolution(2540, 1440))
    val theMotherboard = MotherBoard("BJ-200", 4, 6, "v2.44")
    val thePC = PC(theMonitor, theMotherboard)

    thePC.monitor.drawPixelAt(1500, 1200, "red")
    thePC.motherBoard.loadProgram("Windows 1.0")
}
