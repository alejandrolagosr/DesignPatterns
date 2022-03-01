package creational.factory

/**
 * As the name suggests, Factory takes care of all the object creational logic. In this pattern,
 * a factory class controls which object to instantiate. Factory pattern comes in handy when dealing
 * with many common objects. You can use it where you might not want to specify a concrete class.
 */

fun main() {
    println("--- Factory Example ---")

    val currencyFactory = CurrencyFactoryImpl()

    val mexicoCurrency = currencyFactory.getCurrencyForCountry(Country.Mexico)
    println("Mexico currency is: ${mexicoCurrency.code}")

    val usaCurrency = currencyFactory.getCurrencyForCountry(Country.USA)
    println("USA currency is: ${usaCurrency.code}")

    val spainCurrency = currencyFactory.getCurrencyForCountry(Country.Spain)
    println("Spain currency is: ${spainCurrency.code}")

    val canadaCurrency = currencyFactory.getCurrencyForCountry(Country.Canada)
    println("Canada currency is: ${canadaCurrency.code}")

    println("--- --- ---")
}