package composition.PC

import composition.PC.Monitor.Monitor
import composition.PC.MotherBoard.MotherBoard

class PC(val monitor: Monitor, val motherBoard: MotherBoard)
