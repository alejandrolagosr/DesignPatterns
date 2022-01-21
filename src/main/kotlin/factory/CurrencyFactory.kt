package factory

interface CurrencyFactory {
    fun getCurrencyForCountry(country: Country): Currency
}