package behavioral.state

class Ready : PrinterState {

    override fun print() {
        println("Printed successfully")
    }
}