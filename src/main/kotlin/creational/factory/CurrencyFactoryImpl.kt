package creational.factory

import creational.factory.Country.*

class CurrencyFactoryImpl: CurrencyFactory {

    override fun getCurrencyForCountry(country: Country): Currency {
        return when(country) {
            Canada -> Currency("CAD")
            Mexico -> Currency("MXN")
            Spain -> Currency("EUR")
            USA -> Currency("USD")
        }
    }
}