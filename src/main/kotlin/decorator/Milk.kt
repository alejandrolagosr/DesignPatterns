package decorator

class Milk(coffeeDecorator: CoffeeDecorator): CoffeeDecoratorImpl(coffeeDecorator) {

    override fun getIngredient(): String {
        return coffeeDecorator.getIngredient() + "\n- milk"
    }
}