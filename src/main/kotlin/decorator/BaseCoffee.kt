package decorator

class BaseCoffee: CoffeeDecorator {

    override fun getIngredient(): String {
        return "Please, a coffee with:"
    }
}