package decorator

open class CoffeeDecoratorImpl(protected var coffeeDecorator: CoffeeDecorator): CoffeeDecorator {

    override fun getIngredient(): String {
        return coffeeDecorator.getIngredient()
    }
}