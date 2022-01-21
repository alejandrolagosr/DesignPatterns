package creational.factory

interface CurrencyFactory {
    fun getCurrencyForCountry(country: Country): Currency
}