package decorator

class Sugar(coffeeDecorator: CoffeeDecorator): CoffeeDecoratorImpl(coffeeDecorator) {
    override fun getIngredient(): String {
        return coffeeDecorator.getIngredient() + "\n- sugar"
    }
}