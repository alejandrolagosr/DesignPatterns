package behavioral.state

class Printer() {

    private val ready = Ready()
    private val noInk = NoInk()

    private var state: PrinterState
    private var ink = 2

    init {
        state = ready
    }

    private fun setPrinterState(state: PrinterState) {
        this.state = state
    }

    fun startPrinting() {
        ink--
        if (ink >= 0) {
            setPrinterState(ready)
        } else {
            setPrinterState(noInk)
        }
        state.print()
    }

    fun installInk() {
        ink = 2
        print("Ink installed")
    }
}
