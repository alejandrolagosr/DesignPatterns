package behavioral.state

/**
 * In the State pattern, the state of an object alters its behavior accordingly when the internal state of the object changes.
 */

fun main() {
    val printing = Printer()
    printing.startPrinting()
    printing.startPrinting()
    printing.startPrinting()
    printing.installInk()
    printing.startPrinting()
}