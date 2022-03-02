package behavioral.state

class NoInk : PrinterState {

    override fun print() {
        println("Printer doesn't have ink")
    }
}
