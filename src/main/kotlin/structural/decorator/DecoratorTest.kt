package structural.decorator

/**
 * The Decorator pattern dynamically attaches additional responsibilities to an object to extended its functionality at runtime.
 */
fun main() {
    println("--- Decorator Example ---")

    // Creating a coffee with milk.
    val coffeeWithMilk = Milk(BaseCoffee())
    println(coffeeWithMilk.getIngredient())

    // Creating a coffee with milk and sugar.
    val coffeeWithMilkAndSugar = Milk(Sugar(BaseCoffee()))
    println(coffeeWithMilkAndSugar.getIngredient())

    println("--- --- ---")
}