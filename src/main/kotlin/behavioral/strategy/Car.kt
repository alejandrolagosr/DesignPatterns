package behavioral.strategy

class Car : TransportTypeStrategy {

    override fun travelMode(): String {
        return "Road"
    }
}