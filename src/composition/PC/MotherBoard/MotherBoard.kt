package composition.PC.MotherBoard

class MotherBoard(model: String, ramSlots: Int, cardSlots: Int, bios: String) {
    fun loadProgram(programName: String) {
        println("Program $programName is now loading...")
    }
}
