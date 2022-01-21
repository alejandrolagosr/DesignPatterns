package factory

sealed class Country {
    object Mexico : Country()
    object USA : Country()
    object Canada : Country()
    object Spain : Country()
}