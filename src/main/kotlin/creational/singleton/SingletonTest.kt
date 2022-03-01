package creational.singleton

/**
 * The Singleton pattern specifies that only a single instance of a class should exist with a global access point.
 * This pattern works well when modeling real-world objects with only one instance. For example,
 * if you have an object that makes network or database connections, having more than one instance of the project
 * may cause problems and mix data. That’s why in some scenarios you want to restrict
 * the creation of more than one instance. The Kotlin object keyword declares a singleton without needing
 * to specify a static instance like in other languages:
 */

fun main() {
    ExampleSingleton.exampleMethod()
}